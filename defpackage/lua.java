package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: lua  reason: default package */
public enum lua implements jt0 {
    FORWARD("forward"),
    EXTERNAL_SHARE("external_share");
    
    public final String a;

    static {
        lua[] luaArr;
        X = new pz4(luaArr);
    }

    /* access modifiers changed from: public */
    lua(String str) {
        this.a = str;
    }

    public final Object a(String str) {
        lua lua;
        Iterator it = X.iterator();
        do {
            u1 u1Var = (u1) it;
            if (u1Var.hasNext()) {
                lua = (lua) u1Var.next();
            } else {
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        } while (!hhd.f(lua.a, this.a));
        return lua;
    }
}
