import { Component, OnInit } from '@angular/core';
import { DashboardService } from '../shared/dashboard/dashboard.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

	zapisi: Array<any>

  constructor(private dashboardService: DashboardService) { }

  ngOnInit() {
	  this.dashboardService.getAll().subscribe(data => {this.zapisi = data;})
  }

}
