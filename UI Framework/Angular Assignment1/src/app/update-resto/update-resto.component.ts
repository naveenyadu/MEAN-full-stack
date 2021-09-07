import { Component, OnInit } from '@angular/core';
import {FormGroup,FormControl} from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { RestoService } from '../resto.service';


@Component({
  selector: 'app-update-resto',
  templateUrl: './update-resto.component.html',
  styleUrls: ['./update-resto.component.css']
})
export class UpdateRestoComponent implements OnInit {
  alert: boolean = false;
  editResto=new FormGroup({
    name:new FormControl(''),
    address:new FormControl(''),
    menu:new FormControl('')
  })

  constructor(private router:ActivatedRoute,private resto:RestoService) { }

  ngOnInit(): void {
    console.warn(this.router.snapshot.params.id)
    this.resto.getCurrentResto(this.router.snapshot.params.id).
    subscribe((result: { [x: string]: any; })=>{
      this.editResto=new FormGroup({
        name:new FormControl(result['name']),
        address:new FormControl(result['address']),
        menu:new FormControl(result['menu'])
      })
    })




}
collection(){
  console.warn(this.editResto.value);
  this.resto.updateResto(this.router.snapshot.params.id,this.editResto.value).subscribe(()=>{
    this.alert=true
  })
}
closeAlert(){
  this.alert=false
}
}
