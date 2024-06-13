import { Component } from '@angular/core';
import { RouterLink, RouterLinkActive, RouterOutlet,  } from '@angular/router';
// import {MatIconModule} from '@angular/material/icon';
// import {MatDividerModule} from '@angular/material/divider';
// import {MatButtonModule} from '@angular/material/button';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, RouterLink, RouterLinkActive,
    // MatIconModule,MatButtonModule,MatDividerModule
  ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {

  title = 'travel_buddy_frontend';

  toggle() {
    let doc = document.getElementById('tog-menu');
    doc?.classList.toggle('hidden');
    doc?.addEventListener('click',()=> {
      if (doc) doc.classList.add('hidden');
    },{once:true})
    console.log('hello');
  }
}
