import { Component, OnInit } from '@angular/core';
import { Cryptocurrency } from 'src/app/model/cryptocurrency';
import { CryptocurrencyService } from 'src/app/services/cryptocurrency.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-view-registration',
  templateUrl: './view-registration.component.html',
  styleUrls: ['./view-registration.component.css']
})
export class ViewRegistrationComponent implements OnInit {

  cryptocurrency: Cryptocurrency | undefined;

  constructor(private route: ActivatedRoute, private cryptocurrencyService: CryptocurrencyService) { }

  ngOnInit(): void {
    this.getCryptocurrency(this.route.snapshot.params['id']);
  }


  getCryptocurrency(id: number) {
    this.cryptocurrencyService.getById(id).subscribe({
      next: cryptocurrency => this.cryptocurrency = cryptocurrency,
      error: err => console.error(err),
      });
    }

}
