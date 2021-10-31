import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UploadButtonComponent } from './upload-button/upload-button.component';
import { UploadTableComponent } from './upload-table/upload-table.component';

@NgModule({
  declarations: [
    AppComponent,
    UploadButtonComponent,
    UploadTableComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
