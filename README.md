# 第9回課題

# 概要
MyBatisでREADの実装
- ```/names```でデータベースの情報を取得
- ```/names/{id}```でその名前とIDを取得


# 実行結果
/names でデータベースに登録されている情報を取得
![スクリーンショット_20230121_141154](https://user-images.githubusercontent.com/114993632/213912787-01ec6793-f5ee-49c5-99f9-e4a8476ab557.png)
/names/{id}　でそのIDと名前を取得
![スクリーンショット_20230121_152129](https://user-images.githubusercontent.com/114993632/213912898-2476d735-b46e-49b0-8d4a-a3230bb54114.png)

#つまったところ
- SQLファイルに入力したものがDBに反映されなかったので質問した。

volumeなどを削除して再度Dockerを立ち上げたらできた。参考にしたものhttps://docs.docker.jp/config/pruning.html
- 通信障害や```ERROR 11500 --- [ main] com.zaxxer.hikari.pool.HikariPool```というエラーもでた


application propertiesの```spring.datasource.url=jdbc:mysql://localhost:3306/db_sample```を
```spring.datasource.url=jdbc:mysql://localhost:3306/db_sample?serverTimezone=JST```
としたら無事mysqlに接続できましたという記事を参考にしたが、自分の場合はただDB名を間違えていただけだった、、（はじめによく見直すべきだった！）

# その他自分用メモ
WHERE文句/「throw」と「throws」の違い/```prune```コマンド

間違えてマージしてしまった場合、元に戻すとしてもマージ前のPRの状態に戻るわけではなく新しいブランチが作られる。
