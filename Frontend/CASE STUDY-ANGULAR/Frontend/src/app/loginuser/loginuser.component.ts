import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { LoginPassengerService } from '../loginpassenger.service';

@Component({
  selector: 'app-loginuser',
  templateUrl: './loginuser.component.html',
  styleUrls: ['./loginuser.component.css']
})
export class LoginuserComponent implements OnInit {
  x: any;

  adminlog=new FormGroup(
    {
        username: new FormControl('',Validators.required),
        password: new FormControl('',Validators.required),
        confirmpassword: new FormControl('',Validators.required)
    })
    constructor(private httpClientService: LoginPassengerService, private router:Router) { }
  
    ngOnInit(): void {
    }
  

    validate() {
      this.httpClientService.authent(this.adminlog.value.username, this.adminlog.value.password);
    }

  }