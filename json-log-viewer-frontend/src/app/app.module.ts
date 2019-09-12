import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppComponent} from './app.component';
import {FileLoaderComponent} from './file-loader/file-loader.component';
import {LogVisualizerComponent} from './log-visualizer/log-visualizer.component';
import {FileUploadModule} from 'ng2-file-upload';
import {ToastrModule} from 'ngx-toastr';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {KeysPipe} from './pipes/keys.pipe';

@NgModule({
  declarations: [
    AppComponent,
    FileLoaderComponent,
    LogVisualizerComponent,
    KeysPipe
  ],
  imports: [
    BrowserModule,
    FileUploadModule,
    BrowserAnimationsModule, // required animations module
    ToastrModule.forRoot()
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
