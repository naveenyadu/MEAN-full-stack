import { Component, OnInit } from '@angular/core';
import { Router} from '@angular/router';
import { RestoService } from '../resto.service';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  alert:boolean=false;
  email:string
  password:string
 

  constructor(private resto:RestoService,private router:Router) { }

  ngOnInit(): void {
  }
  logIn(){
    if(this.email=="admin@gmail.com" && this.password=="123"){
      (<any>this.router).navigate([`/home`])
    }
    else if(this.email=="user@gmail.com" && this.password=="123"){
      (<any>this.router).navigate([`/userlist`])

    }
    else if(this.email=="owner@gmail.com" && this.password=="123"){
      (<any>this.router).navigate([`/ownerlist`])

    }
    else{
    alert("Please Enter Valid Details")
    }
  }
  

}


