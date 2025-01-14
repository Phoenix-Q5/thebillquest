import { Component } from '@angular/core';
import {PaymentService} from "../services/payment.service";
import {NgForOf} from "@angular/common";

@Component({
  selector: 'app-product-grid',
  standalone: true,
  imports: [
    NgForOf
  ],
  templateUrl: './product-grid.component.html',
  styleUrl: './product-grid.component.css'
})
export class ProductGridComponent {
  products = [
    { id: 1, name: 'Mobile', description: 'Recharge mobile', image: 'assets/mobile.png' },
    { id: 2, name: 'Electricity', description: 'Pay electricity bills', image: 'assets/electricity.png'},
    { id: 3, name: 'Rent', description: 'Rent payments', image: 'assets/home.png' },
    { id: 4, name: 'Credit Card', description: 'Pay credit bills', image: 'assets/cards.png' },
    { id: 5, name: 'Internet / WiFi', description: 'Pay WiFi/Broadband bills', image: 'assets/wifi.png' }
  ];

  constructor(private paymentService: PaymentService) {}

  // Function to process payment
  processPayment(productId: number) {
    this.paymentService.processPayment(productId).subscribe({
      next: (response) => {
        console.log('Payment processed successfully!', response);
        alert(`Payment for product ${productId} is successful!`);
      },
      error: (error) => {
        console.error('Payment failed', error);
        alert('Payment failed. Please try again.');
      }
    });
  }
}
