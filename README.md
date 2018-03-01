# share
share是一个weex插件，可以通过weexpack快速集成，可以丰富weex功能

支持的WeexSDK版本： >= 0.16.0

# 功能

# 快速使用
- 通过weexpack初始化一个测试工程 weextest
   ```
   weex create weextest
   ```
- 添加ios平台
  ```
  weex platform add ios
  ```
- 添加android平台
  ```
  weex platform add android
  ```
- 添加插件
  ```
  weex plugin add share
  ```
# 项目地址
[github](please add you source code address)

# 已有工程集成
## iOS集成插件Share
- 命令行集成
  ```
  weex plugin add share
  ```
- 手动集成
  在podfile 中添加
  ```
  pod 'Share'
  ```

## 安卓集成插件share
- 命令行集成
  ```
  weexpack plugin add share
  ```
- 手动集成
  在相应工程的build.gradle文件的dependencies中添加
  ```
  compile '${groupId}:share:{$version}'
  ``` 
  注意：您需要自行指定插件的groupId和version并将构建产物发布到相应的依赖管理仓库内去（例如maven）, 您也可以对插件的name进行自定义，默认将使用插件工程的名称作为name


## 浏览器端集成 share
- 命令行集成
  ```
  npm install  share
  ```
- 手动集成
  在相应工程的package.json文件的dependencies中添加
  ```
  share:{$version}'
  ``` 
  
