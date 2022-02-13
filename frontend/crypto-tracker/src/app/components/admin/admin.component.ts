import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CryptocurrencyService } from 'src/app/services/cryptocurrency.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']  
})
export class AdminComponent implements OnInit {

  cryptocurrencies: any;

  constructor(private router: Router, private cryptocurrencyService: CryptocurrencyService) { }

  ngOnInit(): void {
    this.getCryptocurrencies();
  }
  
   getCryptocurrencies() {
    this.cryptocurrencyService.getAll().subscribe({
      next: cryptocurrencies => this.cryptocurrencies = cryptocurrencies,
      error: err => console.error(err),
      complete: () => console.log('Complete notification'),
    });
  }

  redirecToDetails(id: number) {
    this.router.navigate(['/admin/view/' + id]);
  }

}

