package defpackage;

import java.util.Map;

/* renamed from: u57  reason: default package */
public final /* synthetic */ class u57 implements is9 {
    public final /* synthetic */ int a;

    public /* synthetic */ u57(int i) {
        this.a = i;
    }

    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                js9 js9 = (js9) obj2;
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                js9 js92 = (js9) obj2;
                js92.a(thb.g, entry.getKey());
                js92.a(thb.h, entry.getValue());
                return;
            default:
                js9 js93 = (js9) obj2;
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
