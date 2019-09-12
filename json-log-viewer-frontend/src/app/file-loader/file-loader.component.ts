import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {FileUploader} from 'ng2-file-upload';
import {ToastrService} from 'ngx-toastr';

// const URL = '/api/';
const URL = 'http://localhost:8080/api/mackey/file/upload/';

@Component({
  selector: 'app-file-loader',
  templateUrl: './file-loader.component.html',
  styleUrls: ['./file-loader.component.css']
})
export class FileLoaderComponent implements OnInit {
  public uploader: FileUploader = new FileUploader({url: URL});
  @Output() jsonResponse = new EventEmitter<string>();

  constructor(private toastrService: ToastrService) {
  }

  ngOnInit() {

    this.uploader.onAfterAddingFile = (file) => {
      file.withCredentials = false;
    };
    this.uploader.onCompleteItem = (item: any, response: string, status: any) => {
      console.log('Uploaded File Details:', item);
      this.jsonResponse.emit(response);
      this.toastrService.success('File successfully uploaded! with status ' + status);
    };

  }

}
