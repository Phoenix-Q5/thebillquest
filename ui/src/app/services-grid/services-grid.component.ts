import { Component } from '@angular/core';
import {NgForOf} from "@angular/common";
import {PaymentService} from "../services/payment.service";

@Component({
  selector: 'app-services-grid',
  standalone: true,
    imports: [
        NgForOf
    ],
  templateUrl: './services-grid.component.html',
  styleUrl: './services-grid.component.css'
})
export class ServicesGridComponent {
  products = [
    { id: 1, name: 'Movies', description: 'Book Movies', image: 'assets/movie.jpg' },
    { id: 2, name: 'Flights', description: 'Get Flight Tickets', image: 'assets/flight.png'},
    { id: 3, name: 'Bus', description: 'Travel by bus', image: 'assets/bus.jpg' },
    { id: 4, name: 'Cars', description: 'Rent / Lease cars', image: 'assets/car.png' },
    { id: 5, name: 'Train', description: 'Reserve train tickets', image: 'assets/train.png' }
  ];

  constructor(private paymentService: PaymentService) {}

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
