import { Component, OnInit } from '@angular/core';
import {RestoService} from '../resto.service';

@Component({
  selector: 'app-userlist',
  templateUrl: './userlist.component.html',
  styleUrls: ['./userlist.component.css']
})
export class UserlistComponent implements OnInit {
  

  constructor(private resto:RestoService) { }
  collection:any={}
  ngOnInit(): void {
  this.resto.getList().subscribe((result)=>{
    console.warn(result)
    this.collection=result

  })
  
  }
  order(){
    alert("Your order has been placed Successfully")
  }

}
