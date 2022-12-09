import { Injectable } from '@nestjs/common';
import { HttpService } from '@nestjs/axios';
import { lastValueFrom } from 'rxjs';

@Injectable()
export class AppService {
  constructor(private readonly httpService: HttpService) {}
  getHello(): string {
    return 'Hello World!';
  }
  async getTotal(): Promise<string> {
    console.log('gettotal');
    const result = await this.httpService.get(
      //      "https://www.naver.com",
      'https://apis.naver.com/vibeWeb/musicapiweb/vibe/v1/chart/track/total?start=1&display=100')
    // console.log(result, 'result');
    const value = await lastValueFrom(result);
    // console.log(value.data.response.result.chart.items.tracks[0].trackId, 'value');
    // console.log(value.data.response.result.chart.items.tracks[0], 'value');
    // console.log(value.data.response.result.chart.items.tracks[0], 'value');

    return value.data.response.result.chart.items.tracks[0];
  }
}
