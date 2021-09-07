import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {AddRestoComponent} from './add-resto/add-resto.component';
import {ListRestoComponent} from './list-resto/list-resto.component';
import {UpdateRestoComponent} from './update-resto/update-resto.component';
import {LoginComponent} from './login/login.component';
import {RegisterComponent} from './register/register.component';
import { HomeRestoComponent } from './home-resto/home-resto.component';
import { UserlistComponent } from './userlist/userlist.component';
import { OwnerListComponent } from './owner-list/owner-list.component';

const routes: Routes = [
  {
    path: '',redirectTo: '/login', pathMatch: 'full'
  },
  {
    path:'login',component:LoginComponent
  },
  {
    component:UpdateRestoComponent,
    path:'update/:id'
  },
  {
    component:UserlistComponent,
    path:'userlist'
  },
  {
    component:OwnerListComponent,
    path:'ownerlist'
  },
  
  
  {
    component:HomeRestoComponent,
    path:'home',
   children:[
  {
    component:AddRestoComponent,
    path:'add'
  },
  {
    component:ListRestoComponent,
    path:'list'
  },
  
  
  
]
}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
