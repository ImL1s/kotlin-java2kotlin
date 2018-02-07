# 給Java程序員的Kotlin快速入門
- author: ImL1s
- email: iml1s@outlook.com
- kotlin version: 1.2.21
- create data: 2017/02/05

## 參考
- [kotlin英文文檔](https://kotlinlang.org/docs/reference/)
- [kotlin中文文檔](https://www.kotlincn.net/docs/reference/)


## 基礎
### 基本類型

### 包與導入

### 控制流

### 返回與跳轉

## 類與對象
### Class(類與繼承)

### Porperty&Field(屬性與字段)
#### const修飾符
- 被const修飾的變數被稱為[編譯期常量(compile-time constant)](https://www.evernote.com/shard/s704/sh/afbc546a-ce1f-443e-bcb4-e9e245171f32/d7f40c7acd7da7b7d6f00ff5ec48d067)
- 編譯期常量就是在編譯階段就已經可以確定其值的常量
- 此修飾符只能加在頂層(文件)或是object成員上
- 對同樣是kotlin寫的code,呼叫沒有差別
- 對使用Java呼叫Kotlin的const變數,差別在於使用const修飾的變數,不需用getXXX()方式呼叫,如以下
		
		// Hello為被@file:JvmName("Hello")註解的文件
		@file:JvmName("Hello")
		
		const val nameConst = "samConst"
		val nameVal = "samVal"
#
		 @Test
	    public void test() {
	        println(Hello.nameConst);    // const val修飾的變數
	        println(Hello.getNameVal()); // val修飾的變數
	    }
	    
- 被const修飾的變數,編譯出來的java code為
		
		public static final String xxx = "xxx";
		
- 沒被const修飾的val變數,並且是在object為
		
		private static final String xxx = "xxx";
		@NotNull
		public final String getXxx(){
			return xxx;
		}
		
- 沒被const修飾的val變數,並且是在top level為

		private static final String xxx = "xxx";
		@NotNull
		// 在top level中,多了static修飾
		public static final String getXxx(){
			return xxx;
		}
- [參考鏈結](https://www.evernote.com/shard/s704/sh/b69bb17d-3518-4230-80d1-a13cac9d1945/e997f8182fabccfd448c859b7e85c2d5)

### Interface(接口)

### 可見性修飾符


## 其他
### 操作符重載

### 空安全

### 異常

### Annotation(注解)
- 只有註解可以使用literal(字面值)
	
		@GetMapping(value = ["/hello", "/"]) // OK
		@GetMapping(value = arrayOf("/hello", "/")) // OK
		
		val a = arrayOf("/hello", "/") // OK
		val a = ["/hello", "/"] // X
		
		
### 異常

### 反射

### 類型安全的建構子

### 類型別名

### 多平台項目
		
		
