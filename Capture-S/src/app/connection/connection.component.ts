import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../_services/user.service';
import { User } from '../_models/user';

@Component({
  selector: 'app-connection',
  templateUrl: './connection.component.html',
  styleUrls: ['./connection.component.css']
})
export class ConnectionComponent implements OnInit {
  passworduser: string;
  emailaddress: string;
  /*liste = '';*/
  user;
  users = [];
  constructor(private router: Router, private userService: UserService) { }

/*showReturn(r) {
  /*on change objet à string
  this.liste = JSON.stringify(r);
  console.log(r);
}*/
  ngOnInit() {
    /*localStorage.setItem("user","vita");*/

this.userService.getUsers().subscribe(r => this.loadData(r));
}
loadData(r: User[]) {
  this.users = r;
}


  getAccount(id: number) {

    localStorage.setItem('user', this.emailaddress);
    localStorage.setItem('pass', this.passworduser);
    this.router.navigate(['/feed']);
  }
}
