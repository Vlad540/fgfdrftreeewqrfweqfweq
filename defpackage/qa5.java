package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: qa5  reason: default package */
public final /* synthetic */ class qa5 implements cr3, of3, m48, ld8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ qa5(o48 o48, Object obj, int i) {
        this.a = i;
        this.c = o48;
        this.o = obj;
        this.b = true;
    }

    public void accept(Object obj) {
        o10 x;
        long j;
        String str;
        int i;
        switch (this.a) {
            case 1:
                xm8 xm8 = (xm8) obj;
                ad5 ad5 = (ad5) this.c;
                if (ad5.a() && ((FrgAttachVideo) ad5.d).s1 && ad5.c.h1() != null && (x = xm8.a.D0.x(j10.y0)) != null) {
                    if (((String) this.o).equals(x.q)) {
                        ad5.b(xm8, x, ad5.c, this.b, ad5.m, ad5.l);
                        return;
                    }
                    return;
                }
                return;
            default:
                bhe bhe = (bhe) obj;
                v6a v6a = (v6a) this.c;
                List list = null;
                for (tf3 tf3 : ((ap3) v6a.e.getValue()).a.b.values()) {
                    if (TextUtils.equals(bhe.c, tf3.j())) {
                        if (list == null) {
                            list = new ArrayList();
                        }
                        list.add(tf3);
                    }
                }
                if (list == null) {
                    list = Collections.emptyList();
                }
                int size = list.size();
                LinkedHashSet<fp8> linkedHashSet = (LinkedHashSet) this.o;
                boolean z = false;
                if (size == 1) {
                    j = ((tf3) list.get(0)).n();
                    str = null;
                } else {
                    if (!this.b) {
                        str = bhe.c;
                        if (str.length() > 1) {
                            if (linkedHashSet.isEmpty()) {
                                i = 0;
                            } else {
                                i = 0;
                                for (fp8 fp8 : linkedHashSet) {
                                    String str2 = fp8.b;
                                    if ((!(str2 == null || str2.length() == 0)) && (i = i + 1) < 0) {
                                        p23.F();
                                        throw null;
                                    }
                                }
                            }
                            vqc vqc = (xzc) v6a.f.getValue();
                            vqc.getClass();
                            if (i < ((int) vqc.o(PmsKey.mentions_entity_names_limit, (long) 3))) {
                                if (str.charAt(0) == '@') {
                                    str = str.substring(1);
                                }
                                j = 0;
                            } else {
                                return;
                            }
                        }
                    }
                    str = null;
                    j = 0;
                }
                if (j != 0 || (str != null && str.length() != 0)) {
                    if (str == null || str.length() == 0) {
                        z = true;
                    }
                    String str3 = z ^ true ? str : null;
                    ep8 ep8 = ep8.a;
                    int i2 = bhe.b;
                    int i3 = bhe.a;
                    linkedHashSet.add(new fp8(j, str3, ep8, i3, i2 - i3, (Map) null));
                    return;
                }
                return;
        }
    }

    public void b(ic8 ic8) {
        md8 md8 = (md8) this.c;
        md8.getClass();
        a4d q = md8.f.q(ic8, ws6.n((l68) this.o), -1, -9223372036854775807L);
        ud udVar = new ud((Object) md8, (Object) ic8, this.b, 13);
        q.c(new p36((Object) q, 0, (Object) udVar), lh4.a);
    }

    public void f(nn6 nn6, int i) {
        switch (this.a) {
            case 2:
                o48 o48 = (o48) this.c;
                o48.getClass();
                nn6.d(o48.c, i, ((k20) this.o).c(), this.b);
                return;
            case 3:
                o48 o482 = (o48) this.c;
                o482.getClass();
                ts6 i2 = ws6.i();
                int i3 = 0;
                while (true) {
                    List list = (List) this.o;
                    if (i3 < list.size()) {
                        i2.a(((l68) list.get(i3)).d(true));
                        i3++;
                    } else {
                        nn6.J(o482.c, i, new it0(i2.j()), this.b);
                        return;
                    }
                }
            default:
                o48 o483 = (o48) this.c;
                o483.getClass();
                nn6.l0(o483.c, i, ((l68) this.o).d(true), this.b);
                return;
        }
    }

    public Object l(Task task) {
        if (((Integer) task.f()).intValue() != 402) {
            return task;
        }
        boolean z = this.b;
        return afc.k((Context) this.c, (Intent) this.o, z).j(new gr(2), new g95(26));
    }

    public /* synthetic */ qa5(v6a v6a, boolean z, LinkedHashSet linkedHashSet) {
        this.a = 6;
        this.c = v6a;
        this.b = z;
        this.o = linkedHashSet;
    }

    public /* synthetic */ qa5(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
        this.b = z;
    }
}
