import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Observable, throwError } from 'rxjs';
import { CryptocurrencyService } from 'src/app/services/cryptocurrency.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  models: string[] = ['hola', 'manola'];
  cryptoCurrencyForm: FormGroup = new FormGroup({});
  validMessage: String = '';

  constructor(private cryptocurrencyService: CryptocurrencyService) { }

  ngOnInit(): void {
    this.cryptoCurrencyForm = new FormGroup({
      id: new FormControl('', Validators.required),
      symbol: new FormControl('', Validators.required),
      name: new FormControl('', Validators.required),
      hashingAlgorithm: new FormControl('', Validators.required),
      categories: new FormControl('', Validators.required),
      description: new FormControl('', Validators.required),
      links: new FormControl(),
      image: new FormControl(),
      programmingLanguageImplementation: new FormControl('', Validators.required),
      releaseYear: new FormControl('', Validators.required)
    });
  }

  submitRegistration() {
    if (this.cryptoCurrencyForm.valid) {
      this.validMessage = "Gj wachin";
      this.cryptocurrencyService.save(this.cryptoCurrencyForm.value).subscribe({
        next: () => {
          this.cryptoCurrencyForm.reset();
          return true;
        },
        error: error => {throwError(() => error)} 

      })
    }
    else {
      this.validMessage = "bigote de leche";
    }

  }

}
