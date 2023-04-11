import { Component, OnInit } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Booking } from '../booking';
import { Train } from '../train';
import { TraindataService } from '../traindata.service';

@Component({
  selector: 'app-booktickets',
  templateUrl: './booktickets.component.html',
  styleUrls: ['./booktickets.component.css']
})
export class BookticketsComponent implements OnInit {

  // bookingform!: FormGroup;
  trainNo!: String;
  train: Train = new Train();
  book: Booking = new Booking();
  message:any;
  bookdata: any;
  book1: any;
  train1: any;
  // minDate: Date;
  // maxDate: Date;
  CurrentDate:Date;

  //constructor(private service: TraindataService, private router: Router) { }
  constructor(private service: TraindataService, private route: ActivatedRoute, private router: Router) { 
    // const currentYear = new Date().getFullYear();
    // this.minDate = new Date(currentYear - 20, 0, 1);
    // this.maxDate = new Date(currentYear + 1, 11, 31);
    this.CurrentDate=new Date();
  }

  ngOnInit(): void {
    
    this.trainNo = this.route.snapshot.params['trainNo'];
    this.service.getTrainByNo(this.trainNo).subscribe( data => {
      this.train = data;
      console.log(this.train);
      console.log(this.train.trainNo);
      
      

    }, error => console.log(error));

  }

  bookTicket() {
    
    
     let book1=this.book;
     let train1=this.train;
     let book2 = Object.assign(book1, train1)
     console.log((book2));
      this.service.bookNow(book2).subscribe( data => {
        console.log(data);
      
    })
    //alert("Ticket Booking Successful");
    this.router.navigate(['/userticketinfo']);
    
  
  }

}
