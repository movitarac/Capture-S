import { Component, OnInit } from '@angular/core';
import { UserService } from '../_services/user.service';
import { User } from '../_models/user';

@Component({
  selector: 'app-feed',
  templateUrl: './feed.component.html',
  styleUrls: ['./feed.component.css']
})
export class FeedComponent implements OnInit {
  users = [];
  user;
  constructor(private userService: UserService) { }

  ngOnInit() {
    this.userService.getUsers().subscribe(r => this.loadData(r));
  }
  loadData(r: User[]) {
    this.users = r;
  }

  userById(id: number) {
    this.user = this.userService.getUserById(id);
  }
}
