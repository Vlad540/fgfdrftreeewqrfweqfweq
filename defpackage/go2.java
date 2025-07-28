package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: go2  reason: default package */
public final class go2 {
    public final nj4 a;
    public final nj4 b;
    public final nj4 c;
    public final nj4 d;
    public final nj4 e;
    public final nj4 f;
    public final nj4 g;

    public go2(nj4 nj4, nj4 nj42, nj4 nj43, nj4 nj44, nj4 nj45, nj4 nj46, nj4 nj47) {
        this.a = nj4;
        this.b = nj42;
        this.c = nj43;
        this.d = nj44;
        this.e = nj45;
        this.f = nj46;
        this.g = nj47;
    }

    public final CharSequence a(i22 i22) {
        o62 o62;
        j62 j62;
        String format;
        tf3 tf3;
        List list;
        if (i22.c0()) {
            return ((w6a) this.b.get()).a.getString(cic.K2);
        }
        ArrayList i = i22.i();
        if (!i22.J()) {
            if (i22.H()) {
                if (!i.isEmpty()) {
                    int c2 = i22.b.c();
                    if (!((ad3) this.a.get()).e() || !i22.b0() || i22.b.e.size() < i22.b.c()) {
                        format = dhe.s(fsb.tt_chat_subtitle_count, c2, ((w6a) this.b.get()).a);
                    } else {
                        ArrayList i2 = i22.i();
                        o2b o2b = (o2b) this.c.get();
                        if (i2.isEmpty()) {
                            list = Collections.emptyList();
                        } else {
                            ArrayList arrayList = new ArrayList();
                            Iterator it = i2.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                try {
                                    if (o2b.e(((tf3) next).n())) {
                                        arrayList.add(next);
                                    }
                                } catch (Throwable th) {
                                    throw new RuntimeException(th);
                                }
                            }
                            list = arrayList;
                        }
                        int size = list.size();
                        w6a w6a = (w6a) this.b.get();
                        w6a.getClass();
                        StringBuilder sb = new StringBuilder();
                        sb.append(size + 1);
                        sb.append(" ");
                        int i3 = avb.tt_of;
                        Context context = w6a.a;
                        sb.append(context.getString(i3));
                        sb.append(" ");
                        sb.append(c2);
                        sb.append(" ");
                        sb.append(context.getString(avb.tt_contact_status_online));
                        format = sb.toString();
                    }
                } else if (i22.b.c() == 0) {
                    return "";
                } else {
                    if (i22.b0() && i22.b.c() == 1) {
                        return ((w6a) this.b.get()).a.getString(avb.tt_chat_participants_empty__subtitle);
                    }
                    return dhe.s(fsb.tt_chat_subtitle_count, i22.b.c(), ((w6a) this.b.get()).a);
                }
            } else if (i22.G()) {
                w6a w6a2 = (w6a) this.b.get();
                int c3 = i22.b.c();
                if (c3 == 0) {
                    w6a2.getClass();
                    format = "";
                } else {
                    format = dhe.s(fsb.tt_channel_subtitle_count, c3, w6a2.a);
                }
            } else if (i22.D()) {
                j62 j622 = i22.b.K;
                if (j622.g) {
                    synchronized (i22.Z) {
                        try {
                            tf3 = (!i22.D() || i22.Z.isEmpty()) ? null : (tf3) i22.Z.get(0);
                        } catch (Throwable th2) {
                            while (true) {
                                throw th2;
                            }
                        }
                    }
                    if (tf3 != null) {
                        return tf3.d();
                    }
                    return null;
                } else if (r1g.p(j622.e)) {
                    return null;
                } else {
                    return String.format(((w6a) this.b.get()).a.getString(avb.tt_chat_admin_group_name_subtitle), new Object[]{i22.b.K.e});
                }
            } else if (!i22.N() || (o62 = i22.b) == null || (j62 = o62.K) == null) {
                return null;
            } else {
                if (!j62.g) {
                    w6a w6a3 = (w6a) this.b.get();
                    w6a3.getClass();
                    boolean isEmpty = TextUtils.isEmpty((CharSequence) null);
                    Context context2 = w6a3.a;
                    format = !isEmpty ? String.format(context2.getString(avb.tt_chat_group_name_subtitle), new Object[]{null}) : context2.getString(avb.tt_chat_group_subtitle);
                } else if (r1g.p(j62.e)) {
                    return null;
                } else {
                    w6a w6a4 = (w6a) this.b.get();
                    String str = i22.b.K.e;
                    w6a4.getClass();
                    boolean isEmpty2 = TextUtils.isEmpty(str);
                    Context context3 = w6a4.a;
                    format = !isEmpty2 ? String.format(context3.getString(avb.tt_chat_group_name_subtitle), new Object[]{str}) : context3.getString(avb.tt_chat_group_subtitle);
                }
            }
            return format;
        } else if (!i.isEmpty()) {
            return ((q2b) this.d.get()).b((tf3) i.get(0));
        } else {
            return null;
        }
    }
}
