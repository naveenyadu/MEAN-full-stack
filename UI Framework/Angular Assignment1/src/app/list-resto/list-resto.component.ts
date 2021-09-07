import { Component, OnInit } from '@angular/core';
import {RestoService} from '../resto.service';
@Component({
  selector: 'app-list-resto',
  templateUrl: './list-resto.component.html',
  styleUrls: ['./list-resto.component.css']
})
export class ListRestoComponent implements OnInit {
  data: any;
  

  constructor(private resto:RestoService) {}
  collection:any={}
  ngOnInit(): void {
    this.resto.getList().subscribe((result)=>{
      console.warn(result)
      this.collection=result

    })
  }
  
   
    deleteResto(item: number) {
      console.warn()
      this.collection.splice(this.collection.indexOf(item), 1);
      
      this.resto.deleteResto(item).subscribe((result)=>{
        console.log(result)
    
    
        })
  }

    
  }



