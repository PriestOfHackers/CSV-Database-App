import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'WebTonic-UI';

  onFileChanged(event) {
    const file = event.target.files[0];
  }
}
