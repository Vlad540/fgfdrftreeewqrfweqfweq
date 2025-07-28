package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.members.ChatMembersScreen;

/* renamed from: ph2  reason: default package */
public final class ph2 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ph2(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj) {
        int i = 2;
        boolean z = false;
        switch (this.a) {
            case 0:
                if (((Number) obj).intValue() == 10101 && (!((Set) this.b).isEmpty())) {
                    k77[] k77Arr = ChatMembersScreen.y0;
                    ChatMembersScreen chatMembersScreen = (ChatMembersScreen) this.c;
                    qw4 qw4 = (Set) chatMembersScreen.n0().w0.a.getValue();
                    if (qw4 == null) {
                        qw4 = qw4.a;
                    }
                    di2 m0 = chatMembersScreen.m0();
                    taf.n(m0, ((pae) m0.Y.getValue()).b(), (ru3) null, new ai2(qw4, m0, (Continuation) null), 2);
                }
                return jue.a;
            case 1:
                lk3 lk3 = (lk3) obj;
                if (!((fu2) this.b).S0.d(lk3.a) && !lk3.z0) {
                    List list = lk3.o;
                    if (list != null) {
                        Long l = (Long) this.c;
                        if (!list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    long longValue = ((Number) it.next()).longValue();
                                    if (l != null && longValue == l.longValue()) {
                                    }
                                }
                            }
                        }
                    }
                    return Boolean.valueOf(z);
                }
                z = true;
                return Boolean.valueOf(z);
            case 2:
                Throwable th = (Throwable) obj;
                ((ed3) this.b).e((mo1) this.c);
                return jue.a;
            case 3:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ((AtomicBoolean) this.b).set(booleanValue);
                ((j2b) ((g2b) ((t97) this.c).getValue())).a.i("app.debug.fresco", booleanValue);
                if (!booleanValue) {
                    i = 6;
                }
                m75.a.j(i);
                return jue.a;
            default:
                lk3 lk32 = (lk3) obj;
                if (!((ksa) this.b).J0.d(lk32.a) && !lk32.z0) {
                    List list2 = lk32.o;
                    if (list2 != null) {
                        Long l2 = (Long) this.c;
                        if (!list2.isEmpty()) {
                            Iterator it2 = list2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    long longValue2 = ((Number) it2.next()).longValue();
                                    if (l2 != null && longValue2 == l2.longValue()) {
                                    }
                                }
                            }
                        }
                    }
                    return Boolean.valueOf(z);
                }
                z = true;
                return Boolean.valueOf(z);
        }
    }
}
