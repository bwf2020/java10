# 数据库

## 数据库基本概念

### 什么是数据库

数据库是一个按数据结构来存储和管理数据的计算机软件系统。数据库的概念实际包括两层意思：

1. 数据库是一个实体，它是能够合理保管数据的“仓库”，用户在该“仓库”中存放要管理的事务数据，

   “数据”和“库”两个概念结合成为数据库。

2. 数据库是数据管理的新方法和技术，它能更合适的组织数据、更方便的维护数据、更严密的控制数据

   和更有效的利用数据。

### 发展现状

在数据库的发展历史上，数据库先后经历了层次数据库、网状数据库和关系数据库等各个阶段的发展，数据库技术

在各个方面的快速的发展。特别是关系型数据库已经成为目前数据库产品中最重要的一员，80年代以来， 几乎所

有的数据库厂商新出的数据库产品都支持关系型数据库，即使一些非关系数据库产品也几乎都有支持关系数据库的

接口。这主要是传统的关系型数据库可以比较好的解决管理和存储关系型数据的问题。随着云计算的发展和大数

据时代的到来，关系型数据库越来越无法满足需要，这主要是由于越来越多的半关系型和非关系型数据需要用数据

库进行存储管理，以此同时，分布式技术等新技术的出现也对数据库的技术提出了新的要求，于是越来越多的非关

系型数据库就开始出现，这类数据库与传统的关系型数据库在设计和数据结构有了很大的不同， 它们更强调数据

库数据的高并发读写和存储大数据，这类数据库一般被称为`NoSQL`（Not only SQL）数据库。 而传统的关系型数

据库在一些传统领域依然保持了强大的生命力。

### 关系型数据库

关系型数据库，存储的格式可以直观地反映实体间的关系。关系型数据库和常见的表格比较相似，关系型数据库中

表与表之间是有很多复杂的关联关系的。 常见的关系型数据库有`Mysql`、`SqlServer`、`Oracle`等。

基本概念：

- 数据库：保存数据的”仓库”,是若干表的集合
- 表：保存实体的数据
- 行：每一行保存一个实体的信息，也叫一条记录
- 列：保存实体的一个属性，也叫字段

例如：

![1606458006064](image/e04442a7-bed3-4bb0-bd0e-7687dd9f20ac.png)

##  MySql

`MySQL`是一个关系型数据库管理系统，由瑞典MySQL AB 公司开发，属于 `Oracle` 旗下产品。`MySQL` 是最流行

的关系型数据库管理系统之一，在 WEB 应用方面，`MySQL`是最好的 `RDBMS` (Relational Database Management 

System，关系数据库管理系统) 应用软件之一。

`MySQL`所使用的 `SQL` 语言是用于访问`数据库`的最常用标准化语言。`MySQL`软件采用了双授权政策，分为社区

版和商业版，由于其体积小、速度快、总体拥有成本低，尤其是开放源码这一特点，一般中小型网站的开发都选

择`MySQL`作为网站数据库。

### 数据库安装

详见：数据库安装.md

### 连接数据库

```mysql
mysql –h 服务器IP –u 用户名 –p
```



参数说明: 

-h:  host, 主机地址, 后面跟服务器IP

-u:  user, 用户名，后面跟此次连接使用的用户名

-p:  password,密码, 密码在回车后输入，-p后为空

例如： mysql –h localhost –u root –p

### 常用操作

在MySql中，默认的分隔符是分号，在遇到分号时会自动执行分号前的语句，

所以在输入完一个语句后要以分号结尾。

显示当前存在的数据库：

```mysql
show databases;
```

![1606458660438](image/dfb29d23-cfe9-4ba2-8ce9-c13943514221.png)

创建数据库：

```mysql
create database 数据库名;
```

![1606458734767](image/eb3667e5-a767-4d9c-8514-d26587bdc97a.png)

选择数据库：

```mysql
use 数据库名;
```

![1606458778451](image/0eba7660-4b8a-421c-8c0c-c930fb3d014c.png)

查看数据库下的表：

```mysql
show tables;
```

![1606458881020](image/4aec3159-1bc1-4653-a139-41cf1a3ce320.png)

查看表结构: 

```mysql
describe 表名;
```

![1606458920112](image/cc913170-b907-46aa-a31f-04cc84066ee5.png)

设置客户端的字符集：

```mysql
 set names ‘gbk’;
```



### SQL

结构化查询语言(Structured Query Language)简称SQL，是一种数据库查询和程序设计语言，

用于存取数据以及查询、更新和管理关系数据库系统。

SQL从功能可以分为4类：

DDL：Data Definition Language，数据定义语言 create/alter/ drop

DML：Data Manipulation Language，数据操作语言 insert/update/delete/select

DCL：Data Controll language，数据控制语言 grant/revoke

TCL：Transaction Controller language，事务控制语言 commit/rollback

#### 表操作

##### 创建表

建表语法：

```mysql
create table 表名(
    字段1名 数据类型 <约束>,
    字段2名 数据类型 <约束>,
    ......
    字段n名 数据类型 <约束>
);
```



###### 数据类型

Mysql中的数据类型主要包括以下五大类：

整数类型：BIT、TINY INT、SMALL INT、MEDIUM INT、 INT、 BIG INT 等

浮点数类型：FLOAT、DOUBLE、DECIMAL

字符串类型：CHAR、VARCHAR、TEXT、BLOB 等

日期类型：DATE、DATETIME、TIMESTAMP 等

其他数据类型：BINARY、VARBINARY、ENUM 等

1、整型

| MySQL数据类型 | 含义（有符号）                        |
| ------------- | ------------------------------------- |
| tinyint(m)    | 1个字节  范围(-128~127)               |
| smallint(m)   | 2个字节  范围(-32768~32767)           |
| mediumint(m)  | 3个字节  范围(-8388608~8388607)       |
| int(m)        | 4个字节  范围(-2147483648~2147483647) |
| bigint(m)     | 8个字节  范围(+-9.22*10的18次方)      |

取值范围如果加了unsigned，则最大值翻倍，如tinyint unsigned的取值范围为(0~256)。

 int(m)里的m是表示SELECT查询结果集中的显示宽度，并不影响实际的取值范围。

2、浮点型(float和double)

| MySQL数据类型 | 含义                                                |
| ------------- | --------------------------------------------------- |
| float(m,d)    | 单精度浮点型    8位精度(4字节)     m总个数，d小数位 |
| double(m,d)   | 双精度浮点型    16位精度(8字节)    m总个数，d小数位 |

设一个字段定义为float(6,3)，如果插入一个数123.45678,实际数据库里存的是123.457。整数部分最大是3位，如

果插入数12.123456，存储的是12.1234，如果插入12.12，存储的是12.1200.

3、定点数

DECIMAL类型去存储对精度要求比较高的数值，比如金额，也叫定点数，decimal在mysql内存是以字符串二进制

存储的。声明语法是DECIMAL(M,D)，占用字节 M+2 bytes。M是数字最大位数（精度precision），范围1-65；D

是小数点右侧数字个数（标度scale），范围0-30，但不得超过M。

4、字符串(char、varchar、text)

| MySQL数据类型 | 含义                            |
| ------------- | ------------------------------- |
| char(n)       | 固定长度，最多255个字符         |
| varchar(n)    | 可变长度，最多65535个字符       |
| text          | 可变长度，最多65535个字符       |

三者的适用场合：

1. char长度固定， 即每条数据占用固定字节空间；适合用在身份证号码、手机号码等场合。
2. varchar可变长度，可以设置最大长度；适合用在长度可变的属性。
3. text不设置长度， 当不知道属性的最大长度时，适合用text。

char和varchar的区别：

char和varchar都是用来存储字符串的，但是他们保持和检索的方式不同。

char是属于固定长度的字符类型，而varchar是属于可变长度的字符类型。char(n) 若存入字符数小于n，则以空格

补于其后，查询之时再将空格去掉。所以char类型存储的字符串末尾不能有空格，varchar不限于此。 

char(n) 固定长度，char(4)不管是存入几个字符，都将占用4个字节；

varchar(n)是存入的实际字符数+1个字节（n<=255）或2个字节(n>255)，多出的字节记录数据的实际长度。

由于char是固定长度的所以它的处理速度比varchar快很多。但是缺点是浪费存储空间，读取char类型数据时如果

尾部有空格会丢失空格，所以对于那种长度变化不大的并且对查询速度有较高要求的数据可以考虑使用char类型

来存储。

对字符型数据，字母和数字都是只占1个字节，单个中文字符占用几个子节取决于数据库采用的字符集，

采用utf8字符集则1个中文占3个字符，采用gb2312字符集则1个中文占2个字符。

5、二进制数据(BLOB)

BLOB和TEXT存储方式不同，TEXT以文本方式存储，而BLOB是以二进制方式存储，通常用于保存图片，视频等。

6、日期时间类型

| MySQL数据类型 | 含义                          |
| ------------- | ----------------------------- |
| date          | 日期 '2008-12-2'              |
| time          | 时间 '12:25:36'               |
| datetime      | 日期时间 '2008-12-2 22:06:44' |
| timestamp     | 自动存储记录修改时间          |

###### 数据类型的选择

1. 在指定数据类型的时候一般是采用从小原则，比如能用TINY INT的最好就不用INT，能用FLOAT类型的就不用

   DOUBLE类型，这样会对MYSQL在运行效率上提高很大，尤其是大数据量条件下。

2. 根据存储引擎，选择合适的数据类型。

  - MyISAM 数据存储引擎和数据列：MyISAM数据表，最好使用固定长度(char)的数据列

    代替可变长度(varchar)的数据列。

  - InnoDB 存储引擎和数据列：建议使用 varchar类型。这要涉及到InnoDB存储引擎的存储表空间，

    因为InnoDB的索引和数据是存在同一个表空间里的，在操作数据时，其是将一部分数据载入内存或者是  

    InnoDB buffer pool，由于varchar是变长字符，所以它所占的内存或者是buffer就相对就比较小，

    所以速度就比较快，char比varchar快是站在CPU的角度来说的，但性能是综合各种因素后的最终结果，

    当InnoDB buffer pool小于表大小时，"磁盘IO"成为了性能的关键因素，而varchar更短，

    因此性能反而比char高。

###### 数据库约束

约束是一种限制，它通过对表的行或列的数据做出限制，来确保表的数据的完整性、唯一性。

MYSQL中，常用的几种约束：

| 约束类型： | 主键        | 默认值  | 唯一   | 外键        | 非空     |
| ---------- | ----------- | ------- | ------ | ----------- | -------- |
| 关键字：   | PRIMARY KEY | DEFAULT | UNIQUE | FOREIGN KEY | NOT NULL |

1. 主键(PRIMARY KEY)

   主键约束用于约束表中的一行，作为这一行的唯一标识，在一张表中通过主键就能准确定位到一行，

   因此主键十分重要。主键要求这一行的数据不能有重复且不能为NULL。

   还有一种特殊的主键——复合主键。主键不仅可以是表中的一列，也可以由表中的两列或多列来共同标识。

   MySql中经常使用自增列(类型必须是整数类型)作为主键: auto_increment;  

   自增列的数据假如插入记录时没有指定则自动加1，如指定则插入指定的数据。

   例如：

   ```mysql
   stu_id int primary key auto_increment /*自增主键*/
   ```




2. 默认值(DEFAULT)

   默认值约束规定，对有DEFAULT约束的列，插入数据时未指定其值，则插入默认值。

   在insert语句中值列表的部分，可以使用default访问默认值。

   例如：

   建表语句：

   ```mysql
   stu_age int default 20 /*默认值为20*/
   ```

   

   插入数据：

   ```mysql
   insert into student(stu_age) values(default); /*这条记录的stu_age为20*/
   ```




3. 唯一(UNIQUE)

   唯一约束(UNIQUE)规定某列的值不能有重复值，即这一列的每个值都是唯一的。

   唯一约束与主键的区别是唯一约束可以取NULL值，主键不能取NULL值。

   因为NULL的含义是不确定，2个不确定并不相等

   例如：

   ```mysql
     stu_no char(10) unique
   ```

   


4. 外键(FOREIGN KEY)

   外键(FOREIGN KEY)既能确保数据完整性，也能表现表之间的关系。一个表可以有多个外键，

   每个外键必须REFERENCES(参考)另一个表的主键，被外键约束的列，取值必须在它参考的列中有对应值。

   ![image-20210108110042506](image/0e2412a7-547c-43f8-b87d-a1d8ea93412f.png)

   需要注意的是，主键列、外键列的数据类型建议完全一致；外键列插入数据时其值可以为NULL

   外键添加方式有多种，常用的方式之一是通过修改表的方式添加外键，

   语法：

   ```mysql
   alter table 从表 add foreign key(外键列) references 主表(主键列);
   ```

   

   例如：

   ```mysql
   alter table student add foreign key(class_id) references class(class_id); 
   ```




5. 非空约束(NOT NULL)

   非空约束即被约束的列，在插入值时不能为NULL。

   例如：

   ```mysql
   stu_name varchar(20) not null 
   ```



完整示例：

```mysql
create table class( /*班级表*/
	 class_id int primary key auto_increment,
	 class_name varchar(20) not null
);

create table student( /*学生表*/
     stu_id int primary key auto_increment,
	 stu_no char(4) unique,
     stu_name varchar(20) not null ,
     stu_age int default 20,
     stu_intime date,
     class_id int
);

alter table student add foreign key(class_id) references class(class_id); /*添加外键约束*/
```



注意：建表前先选择数据库

 

##### 删除表

```mysql
drop table 表名
```



这种删除方式会将表和表中的数据全部删掉

例如：

```mysql
drop table class;
drop table student;
```



#### 数据操作

##### 插入数据

语法: 

```mysql
insert into表名(字段名1，字段名2，…..字段名n) values(值1,值2,…..值n);
```



同时插入多条记录：

```mysql
insert into 表名(字段名1，字段名2，…..字段名n) values(值列表1), (值列表2), (值列表3),……(值列表4);
```



值列表中，字符类型和日期类型的数据，要放在一对单引号中，日期类型的默认格式 ‘yyyy-MM-dd hh:mm:ss’

数值类型的数据，直接写即可

例如：

```mysql
insert into student(stu_no,stu_name,stu_intime) values('S001','tom','2020-01-01');
```



字段列表当插入一条完整数据的时候可以省略, 此时值列表的顺序必须和表结构保持一致

```mysql
insert into student values(8,'S002','mike',default,'2020-01-02',2);
```



##### 更新数据

语法：

 ```mysql
update 表名 set 字段1=新值1, 字段2=新值2 <where 条件>
 ```



假如后面不带条件，则更新所有记录

例如：

```mysql
update student set stu_name='张三',stu_age=22 where stu_id=1;
```



##### 删除数据

语法：

```mysql
delete from 表名 <where 条件>
```

delete只删除数据，不删除表；假如后面不带条件，则删除表中所有记录

 例如：

```mysql
delete from student where stu_id=1;
```



#### 数据查询

语法：

```mysql
SELECT  字段列表  
FROM  表或视图
[ WHERE  条件表达式 ]
[ GROUP BY  分组字段  [ HAVING 过滤条件 ] ]
[ ORDER BY  排序字段  [ ASC | DESC ] ]
```



例如：

```mysql
select stu_id,stu_no,stu_name,stu_age,stu_intime,class_id from student;
```



假如查询所有字段，字段列表可以用*代替，此时结果集的顺序与表结构一致。

需要注意的是，这种方式在代码中应**避免使用**。

例如：

```mysql
select * from student;
```



##### 查询条件：

![1606718229677](image/37fe84f9-8f5c-441c-88d3-49d3a6c36a43.png)



###### 范围查询：BETWEEN ... AND

语法：

```mysql
[ NOT ]  BETWEEN 取值1  AND  取值2 
```



可以判读某个字段的值是否在指定的范围内。如果字段的值在指定范围内，则满足查询条件，

该记录将被查询出来。如果不在指定范围内，则不满足查询条件。

例如：

```mysql
select * from student where stu_age between 20 and 30;
```



使用比较运算符能够实现相同的效果

上面的`sql`语句等价于：

```mysql
select * from student where stu_age >= 20 and stu_age <= 30;
```



###### 集合查询：IN

语法：

```mysql
[ NOT ]  IN  ( 元素1, 元素2, …, 元素n ) 
```



可以判断某个字段的值是否在指定的集合中。如果字段的值在集合中，则满足查询条件，该记录将被查询出来。

如果不在集合中，则不满足查询条件。

例如：

```mysql
select * from student where stu_id in (1,2,3);
```



使用多个并列条件可以实现相同的效果

```mysql
select * from student where stu_id = 1 or stu_id = 2 or stu_id = 3;
```

 

###### 模糊查询：LIKE

语法：

```mysql
[ NOT ]  LIKE  '匹配字符串'
```



可以检查字段值是否匹配指定格式。如果字段的值与指定的格式相匹配，则满足查询条件，该记录将被查询出来；

如果与指定的格式不匹配，则不满足查询条件。其通配规则如下：

2个通配符： 

- % 通配0或多个字符
- _ 通配单个字符

例如:

```mysql
select * from student where stu_name like ‘%e%’; /*查询名字中有一个e的所有学生*/

select * from student where stu_name like ‘_e%’; /*查询名字第2个字符为e的所有学生*/

select * from student where stu_name like ‘_e_’;/*查询名字第2个字符为e且名字的长度为3的所有学生*/
```



###### NULL值查询：IS NULL

语法：

```mysql
IS  [ NOT ]  NULL
```



可以用来判断字段的值是否为空值（NULL）。如果字段的值是空值，则满足查询条件，该记录将被查询出来。

如果字段的值不是空值，则不满足查询条件。

例如：

```mysql
select * from student where stu_no is null;
```



不能用 stu_no = null 进行判断，因为null表示不确定，任何值与null使用=进行比较都是false。

例如：

```mysql
select * from student where stu_no = null; /*查不出stu_no为null的数据*/
```



###### 多条件查询：OR、AND

连接多个条件；OR是或，AND是且

AND的语法规则如下：

```mysql
条件表达式1  AND  条件表达式2  [ … AND 条件表达式n ]
```



AND关键字可以用来联合多个条件进行查询。使用AND关键字时，只有同时满足所有查询条件的记录会被查询出

来。如果不满足这些查询条件的其中一个，这样的记录将被排除掉。AND可以连接两个条件表达式。

而且，可以同时使用多个AND关键字，这样可以连接更多的条件表达式

例如：

```mysql
select * from student where class_id = 1 and stu_age = 20;
```



OR的语法规则如下：

```mysql
条件表达式1  OR条件表达式2  [ … OR条件表达式n ]
```



OR关键字也可以用来联合多个条件进行查询，但是与AND关键字不同。使用OR关键字时，只要满足这几个查询条

件的其中一个，这样的记录将会被查询出来。如果不满足这些查询条件中的任何一个，这样的记录将被排除掉。

其中，OR可以用来连接两个条件表达式。而且，可以同时使用多个OR关键字，这样可以连接更多的条件表达式。

例如：

```mysql
select * from student where class_id = 1 or class_id = 2;
```



##### 去重：DISTINCT

假如返回的结果中有多个重复的记录，可以使用distinct将重复的记录去除

语法：

```mysql
SELECT DISTINCT 字段名 FROM 表名 
```



例如：

```mysql
select distinct stu_age from student;
```



##### 排序：ORDER  BY

语法：

```mysql
SELECT DISTINCT 字段名 FROM 表名 ORDER  BY  排序字段  [ ASC | DESC ]
```



从表中查询出来的数据可能是无序的，或者其排列顺序不是用户所期望的顺序。为了使查询结果的顺序满足用户的

要求，可以使用ORDER BY关键字对记录进行排序。默认为升序排列，如需降序，需显式指定排序方式是 `desc` 。

例如：

```mysql
select * from student order by stu_age ; /*按年龄升序排列*/
select * from student order by stu_age desc; /*按年龄降序排列*/
```



排序字段可以有多个，并且可以分别指定每个排序字段的排序方式。

例如：

```mysql
/*先按班级编号升序排列，班级编号相同的情况下，按照学号进行降序排列*/
select * from student order by class_id asc,stu_id desc ; 
```