import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { Observable } from 'rxjs';
import { Cryptocurrency } from '../model/cryptocurrency';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json'})
};

@Injectable({
  providedIn: 'root'
})
export class CryptocurrencyService {

  private path = environment.baseUrl + '/cryptocurrencies';

  constructor(private http: HttpClient) { }

  getAll(): Observable<Cryptocurrency[]> {
    return this.http.get<Cryptocurrency[]>(this.path);
  }

  getById(id: number): Observable<Cryptocurrency> {
    return this.http.get<Cryptocurrency>(this.path + '/' + id);
  }

  save(cryptocurrency: Cryptocurrency) {
    return this.http.post(this.path, JSON.stringify(cryptocurrency), httpOptions);
  }

}
