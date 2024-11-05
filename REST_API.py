import os
import requests
def pulseRate(diagnosisName,doctorId):
    url=f"https://jsonmock.hackerrank.com/api/medical_records?"
    total_pulse_rate=0
    total_patients=0
    page=1
    while True:
        response=requests.get(f"{url}&?page=page")
        data=response.json()
        if page>data['total_pages']:
            break
        print(f'Records in Page{page}')
        for i in data['data']:
            print(i)
        for record in data['data']:
            if (record['diagnosis']['name']==diagnosisName) & (record['doctor']['id']==doctorId) & ('vitals' in record) & ('pulse' in record['vitals']):
                total_pulse_rate+=record['vitals']['pulse']
                total_patients+=1
        page+=1
    if total_patients>0:
        average_pulse_rate=total_pulse_rate/total_patients
        if average_pulse_rate%10==0:
            return average_pulse_rate
        else:
            return int(average_pulse_rate)+1
    else:
        return 0
print(pulseRate('Common cold',2))