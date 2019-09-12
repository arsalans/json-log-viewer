import {Component} from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  parentJsonFile = '';
  title = 'json-log-viewer';

  onJsonResponse(event) {
    this.parentJsonFile = event;
  }
}
