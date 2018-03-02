# appearjs

tell if a dom element appeared or disappeared.

### demo

```javascript
var appearInstance = lib.appear.init({
    container: '#container', // optional, document by default.
    cls: 'lib-appear', // optional
    once: true, // optional
    x: 0, // opitonal
    y: 0, // optional
    onAppear: function(){} // callback.
});
```

### instance API

* appearInstance.bind(node)
* appearInstance.fire()
* appearInstance.reset(opts)

### static API

* lib.appear.init(options)
* lib.appear.fireAll()

### events

* _appear

element.addEventListener('_appear', function(ev){});

* _disappear

element.addEventListener('_disappear', function(ev){});

* evt object

`evt.data.direction`（top｜right｜bottom｜left｜none）
