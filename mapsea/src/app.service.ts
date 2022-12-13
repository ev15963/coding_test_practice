import { Injectable } from '@nestjs/common';
import { HttpService } from '@nestjs/axios';
import { lastValueFrom } from 'rxjs';
import { UserDto } from './dto/app.dto';

@Injectable()
export class AppService {
  constructor(private readonly httpService: HttpService) {}
  getHello(): string {
    return 'Hello World!';
  }
  async getTotal(): Promise<string> {
    console.log('gettotal');
    const result = await this.httpService.get('https://apis.naver.com/vibeWeb/musicapiweb/vibe/v1/chart/track/total?start=1&display=100');
    // console.log(result, 'result');
    const value = await lastValueFrom(result);
    // console.log(value.data.response.result.chart.items.tracks[0], 'value');
    // //가수명
    // let singer = value.data.response.result.chart.items.tracks[0].artists[0].artistName;
    // //곡명
    // let track = value.data.response.result.chart.items.tracks[0].trackTitle;
    // //발매일
    // let album = value.data.response.result.chart.items.tracks[0].album.releaseDate;

    // let result_json = { singer: singer, track: track, album: album };
    
    return value.data;
  }

 async getSinger(userData: UserDto) : Promise<string>{
  console.log(userData, 'getSinger');
  const result = await this.httpService.get('https://apis.naver.com/vibeWeb/musicapiweb/vibe/v1/chart/track/total?start=1&display=5');
    // console.log(result, 'result');
  const value = await lastValueFrom(result);
   let api_data = value.data.response.result.chart.items.tracks;

     let result_new = api_data.filter(findone => findone.trackId == userData);
     console.log(result_new, 'result_new');

   return result_new;
 }
}
