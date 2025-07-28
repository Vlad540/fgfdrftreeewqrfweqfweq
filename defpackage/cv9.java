package defpackage;

import java.util.ArrayList;

/* renamed from: cv9  reason: default package */
public final class cv9 extends ArrayList implements yu9 {
    public volatile int a;

    public final void a() {
        add(ap9.a);
        this.a++;
    }

    public final void b(Object obj) {
        add(obj);
        this.a++;
    }

    public final void c(wu9 wu9) {
        if (wu9.getAndIncrement() == 0) {
            bw9 bw9 = wu9.b;
            int i = 1;
            while (!wu9.o) {
                int i2 = this.a;
                Integer num = (Integer) wu9.c;
                int intValue = num != null ? num.intValue() : 0;
                while (intValue < i2) {
                    if (!ap9.a(bw9, get(intValue)) && !wu9.o) {
                        intValue++;
                    } else {
                        return;
                    }
                }
                wu9.c = Integer.valueOf(intValue);
                i = wu9.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }
    }

    public final void d(Throwable th) {
        add(new yo9(th));
        this.a++;
    }
}
