# osquery-clj

API that retrieve information about your SO (osquery-clj example)

## Request and Response

Get logged users.
Method: GET
URL: http://localhost:3000/api/users/
Response:
```json
[
   {
      "gid_signed":"513",
      "gid":"513",
      "description":"",
      "type":"local",
      "directory":"C:\\Users\\59898",
      "uuid":"S-1-5-21-11711324-753106884-3940322080-1001",
      "uid":"1001",
      "shell":"C:\\Windows\\System32\\cmd.exe",
      "uid_signed":"1001",
      "username":"59898"
   },
   {
      "gid_signed":"513",
      "gid":"513",
      "description":"Built-in account for administering the computer/domain",
      "type":"local",
      "directory":"",
      "uuid":"S-1-5-21-11711324-753106884-3940322080-500",
      "uid":"500",
      "shell":"C:\\Windows\\System32\\cmd.exe",
      "uid_signed":"500",
      "username":"Administrator"
   }
]
```

Get logged user by id.
Method: GET
URL: http://localhost:3000/api/user/20
Response:
```json
[
   {
      "gid_signed":"20",
      "gid":"20",
      "description":"",
      "type":"special",
      "directory":"%systemroot%\\ServiceProfiles\\NetworkService",
      "uuid":"S-1-5-20",
      "uid":"20",
      "shell":"C:\\Windows\\system32\\cmd.exe",
      "uid_signed":"20",
      "username":"NETWORK SERVICE"
   }
]
```

Get active processes.
Method: GET
URL: http://localhost:3000/api/processes/
Response:
```json
[
   {
      "parent":"0",
      "gid":"-1",
      "pid":"0",
      "suid":"-1",
      "handle_count":"-1",
      "on_disk":"-1",
      "path":"",
      "uid":"-1",
      "egid":"-1",
      "cmdline":"",
      "root":"",
      "elapsed_time":"-1",
      "sgid":"-1",
      "state":"",
      "system_time":"-1",
      "disk_bytes_read":"-1",
      "euid":"-1",
      "wired_size":"-1",
      "disk_bytes_written":"-1",
      "total_size":"-1",
      "threads":"8",
      "nice":"-1",
      "is_elevated_token":"",
      "pgroup":"-1",
      "cwd":"",
      "percent_processor_time":"-1",
      "start_time":"-1",
      "name":"[System Process]",
      "resident_size":"-1",
      "user_time":"-1"
   },
   {
      "parent":"0",
      "gid":"-1",
      "pid":"4",
      "suid":"-1",
      "handle_count":"-1",
      "on_disk":"-1",
      "path":"",
      "uid":"-1",
      "egid":"-1",
      "cmdline":"",
      "root":"",
      "elapsed_time":"-1",
      "sgid":"-1",
      "state":"",
      "system_time":"-1",
      "disk_bytes_read":"-1",
      "euid":"-1",
      "wired_size":"-1",
      "disk_bytes_written":"-1",
      "total_size":"-1",
      "threads":"185",
      "nice":"-1",
      "is_elevated_token":"",
      "pgroup":"-1",
      "cwd":"",
      "percent_processor_time":"-1",
      "start_time":"-1",
      "name":"System",
      "resident_size":"-1",
      "user_time":"-1"
   }
]
```

Get process by id.
Method: GET
URL: http://localhost:3000/api/process/72
Response:
```json
[
   {
      "parent":"4",
      "gid":"-1",
      "pid":"72",
      "suid":"-1",
      "handle_count":"-1",
      "on_disk":"-1",
      "path":"",
      "uid":"-1",
      "egid":"-1",
      "cmdline":"",
      "root":"",
      "elapsed_time":"-1",
      "sgid":"-1",
      "state":"",
      "system_time":"-1",
      "disk_bytes_read":"-1",
      "euid":"-1",
      "wired_size":"-1",
      "disk_bytes_written":"-1",
      "total_size":"-1",
      "threads":"0",
      "nice":"-1",
      "is_elevated_token":"",
      "pgroup":"-1",
      "cwd":"",
      "percent_processor_time":"-1",
      "start_time":"-1",
      "name":"Secure System",
      "resident_size":"-1",
      "user_time":"-1"
   }
]
```
Get os version.
Method: GET
URL: http://localhost:3000/api/os/
Response:
```json
[
   {
      "version":"10.0.21332"
   }
]
```
Get kernel version.
Method: GET
URL: http://localhost:3000/api/kernel/
Response:
```json
[
   {
      "version":"10.0.21332.1000"
   }
]
```



## License

Copyright © 2021 Valentín Fernández