#### 用户管理

##### 注册

post|/user

请求参数：

| 参数     | 参数类型 | 参数描述 |
| -------- | -------- | -------- |
| userName | String   |          |
| password | String   |          |
| email    | String   |          |

返回示例：

```
{
    "message":"操作成功"，
    "status":200,
    "data":{
        "userId":1,
        "userName":"",
        "email":""
    }
}
```

##### 登录

post|/user/login

请求参数：

| 参数     | 参数类型 | 参数描述 |
| -------- | -------- | -------- |
| userName | String   |          |
| password | String   |          |

返回示例：

```json
{
    "message":"操作成功"，
    "status":200,
    "data":{
        "userId":"",
        "avatar":""
    }
}
```

##### 查看用户信息

get |/user/{userId}

返回示例：

```
{
    "message":"操作成功"，
    "status":200,
    "data":{
        "userName"："",
        "avatar":"",
        "sex":"",
        "introduction":""
        "phone_number":"",
        "email":""
    }
}
```

##### 修改用户信息

put |/user/{userId}

请求参数：

| 参数         | 参数类型 | 参数描述 |
| ------------ | -------- | -------- |
|              |          |          |
| userName     | String   |          |
| sex          | String   |          |
| introduction | String   |          |
| phone_number | String   |          |
| email        | String   |          |

返回示例：

```
{
    "message":"操作成功"，
    "status":200,
    "data":{}
}
```

##### 查找用户

get /user/userName

请求参数：

| 参数     | 参数类型 | 参数描述 |
| -------- | -------- | -------- |
| userName | String   |          |

返回示例：

```
    {

        "message":"操作成功"，

        "status":200,

        "data":[

            {

                "userId":1,

                "userName":"",

                "avatar":"",

                "sex":"",

                "introduction":"",

                "phoneNumber":"",

                "email":""

            }

        ]
    }

```



#### 主页展示

get| /team/userTeam

#####展示我的团队列表

请求参数：

| 参数   | 参数类型 | 参数描述 |
| ------ | -------- | -------- |
| userId | int      |          |

返回示例：

```
{
    "message":"操作成功"，
    "status":200,
    "data":[
        {
        "teamId":1,
        "teamName":"",
        "description":""
         }
    ]
}
```



##### 展示我的消息列表

get| /message/userMessage

请求参数：

| 参数   | 参数类型 | 参数描述 |
| ------ | -------- | -------- |
| userId | int      |          |

返回示例：

```
{
    "message":"操作成功"，
    "status":200,
    "data":[
        {
            "userName":"",
            "teamName":"",
            "messageId":""
        }
    ]
}
```





#### 项目管理

##### 展示我的项目列表

get| /project/userProject

请求参数：

| 参数   | 参数类型 | 参数描述 |
| ------ | -------- | -------- |
| userId | int      |          |

返回示例：

```
{
    "message":"操作成功"，
    "status":200,
    "data":[
        {
            "projectId":1,
            "projectName":"",
            "description":""
        }
    ]
}
```



##### 删除项目

delete| /project/{projectId}

返回示例：

```
{
    "message":"操作成功"，
    "status":200,
    "data":{}
}
```

#####  增加项目

post| /project

请求参数：

| 参数        | 参数类型 | 参数描述 |
| ----------- | -------- | -------- |
| projectName | String   |          |
| description | String   |          |
| address     | String   |          |

返回示例：

```
{
    "message":"操作成功"，
    "status":200,
    "data":{}
}
```



##### 修改项目

put| /project/{projectId}

请求参数：

| 参数        | 参数类型 | 参数描述 |
| ----------- | -------- | -------- |
|             |          |          |
| projectName | String   |          |
| description | String   |          |
| address     | String   |          |

返回示例：

```
{
    "message":"操作成功"，
    "status":200,
    "data":{}
}
```

##### 查看项目

get| /project/{projectId}

返回示例：

```
{
    "message":"操作成功"，
    "status":200,
    "data":{
        "porjectId":1,
        "projectName":"",
        "description":"",
        "address":""
    }
}
```

##### 下载项目接口

get| /interface/download

请求参数：

| 参数      | 参数类型 | 参数描述 |
| --------- | -------- | -------- |
| projectId | int      |          |

返回示例：

```
{
    "message":"操作成功"，
    "status":200,
    "data":null
}
```

##### 查看项目接口列表

get |/interface/projectInterface

请求参数：

| 参数      | 参数类型 | 参数描述 |
| --------- | -------- | -------- |
| projectId | int      |          |

返回示例：

```
{
    "message":"操作成功"，
    "status":200,
    "data":[
        {
            "interfaceId":1,
            "interfaceName":"",
            "method":"",
            "description":"",
            "url":"",
            "json":""
        }
    ]
}
```



##### 增加接口

post| /interface

请求参数：

| 参数          | 参数类型 | 参数描述 |
| ------------- | -------- | -------- |
| interfaceName | String   |          |
| method        | String   |          |
| description   | Strng    |          |
| url           | String   |          |
| json          | String   |          |
| projectId     | int      |          |

返回示例：

```
{
    "message":"操作成功"，
    "status":200,
    "data":null
}
```

##### 删除接口

delete| /interface/{interfaceId}

返回示例：

```
{
    "message":"操作成功"，
    "status":200,
    "data":null
}
```



##### 修改接口

put| /interface/{interfaceId}

请求参数：

| 参数          | 参数类型 | 参数描述 |
| ------------- | -------- | -------- |
|               |          |          |
| interfaceName | String   |          |
| method        | String   |          |
| description   | String   |          |
| url           | String   |          |
| json          | String   |          |

返回示例：

```
{
    "message":"操作成功"，
    "status":200,
    "data":null
}
```

##### 查看接口

get| /interface/{interfaceId}

请求参数：

返回示例：

```
{
    "message":"操作成功"，
    "status":200,
    "data":{
        “interfaceId”:1,
        "interfaceName":"",
        "method":"",
        "description":"",
        "url":"",
        "json":""
    }
}
```

#####  模拟接口

get | /interface/mock

返回示例：

#### 团队管理

get | /team/userTeam

##### 查看我的团队列表

请求参数：

| 参数   | 参数类型 | 参数描述 |
| ------ | -------- | -------- |
| userId | int      |          |

返回示例：

```
{
    "message":"操作成功"，
    "status":200,
    "data":[
        {
        "teamId":1,
        "teamName":"",
        "description":""
        }
    ]
}
```



##### 创建团队

post| /team

请求参数：

| 参数        | 参数类型 | 参数描述 |
| ----------- | -------- | -------- |
| userId      | int      |          |
| teamName    | String   |          |
| description | String   |          |

返回示例：

```
{
    "message":"操作成功"，
    "status":200,
    "data":null
}
```



#####  删除团队

delete |/team/{teamId}

请求参数：

返回示例：

```
{
    "message":"操作成功"，
    "status":200,
    "data":null
}
```

##### 修改团队

put| /team/{teamId}

请求参数：

| 参数        | 参数类型 | 参数描述 |
| ----------- | -------- | -------- |
|             |          |          |
| teamName    | String   |          |
| description | String   |          |

返回示例：

```
{
    "message":"操作成功"，
    "status":200,
    "data":null
}
```

##### 查看团队项目

get| /project/teamProject

请求参数：

| 参数   | 参数类型 | 参数描述 |
| ------ | -------- | -------- |
| teamId | int      |          |

返回示例：

```
{
    "message":"操作成功"，
    "status":200,
    "data":[
        {
            "projectId":1,
            "projectName":"",
            "description":"",
            "address":""
        }
    ]
}
```

#####  删除团队项目

delete| /team/teamProject

请求参数：

| 参数      | 参数类型 | 参数描述 |
| --------- | -------- | -------- |
| projectId | int      |          |

返回示例：

```
{
    "message":"操作成功"，
    "status":200,
    "data":null
}
```



##### 查看团队成员

get| /team/teamMember

请求参数：

| 参数   | 参数类型 | 参数描述 |
| ------ | -------- | -------- |
| teamId | int      |          |

返回示例：

```
{
    "message":"操作成功"，
    "status":200,
    "data":[
        {
            "userId":1,
            "userName":"",
            "avatar":"",
            "sex":"",
            "introduction":"",
            "phoneNumber":"",
            "email":""
        }
    ]
}
```



#####  删除团队成员

delete| /team/teamMember

请求参数：

| 参数   | 参数类型 | 参数描述 |
| ------ | -------- | -------- |
| userId | int      |          |
| teamId | int      |          |

返回示例：

```
{
    "message":"操作成功"，
    "status":200,
    "data":null
}
```



#####  查找用户

get /user/userName

请求参数：

| 参数     | 参数类型 | 参数描述 |
| -------- | -------- | -------- |
| userName | String   |          |

返回示例：

```
{
    "message":"操作成功"，
    "status":200,
    "data":[
        {
            "userId":1,
            "userName":"",
            "avatar":"",
            "sex":"",
            "introduction":"",
            "phoneNumber":"",
            "email":""
        }
    ]
}
```



#### 消息

##### 增加我的消息

post | /message

/** 加入团队和邀请人加入团队都用这个接口**/

请求参数：

| 参数   | 参数类型 | 参数描述 |
| ------ | -------- | -------- |
| userId | int      |          |
| teamId | int      |          |

返回示例：

```
{
    "message":"操作成功"，
    "status":200,
    "data":null
}
```

##### 查看我的消息

get| /message/userMessage

请求参数：

| 参数   | 参数类型 | 参数描述 |
| ------ | -------- | -------- |
| userId | int      |          |

返回示例：

```
{
    "message":"操作成功"，
    "status":200,
    "data":[
        {
            "messageId":1,
            "userName":"",
            "teamName":""
        }
    ]
}
```



##### 删除我的消息

delete /message/{messageId}

请求参数：

| 参数      | 参数类型 | 参数描述 |
| --------- | -------- | -------- |
| messageId | int      |          |

返回示例：

```
{
    "message":"操作成功"，
    "status":200,
    "data":null
}
```

##### 读消息

get| /message/{messageId}

返回示例：

```
{
    "message":"操作成功"，
    "status":200,
    "data":{
        "messageId":1,
        "sendUserId":"",
        "teamId":"",
        "readFlag":0
    }
}
```
