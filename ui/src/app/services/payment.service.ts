import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import { environment } from '../../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class PaymentService {
  private baseUrl = environment.baseUrl;

  constructor(private http: HttpClient) {}

  processPayment(productId: number) {
    const url = `${this.baseUrl}/payments/${productId}`;
    return this.http.post(url, {});
  }
}
