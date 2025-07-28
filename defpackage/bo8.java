package defpackage;

/* renamed from: bo8  reason: default package */
public final class bo8 {
    public final t97 a;
    public final t97 b;

    public bo8(t97 t97, t97 t972) {
        this.a = t97;
        this.b = t972;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [a07, java.lang.Object] */
    public final void a(long j, int i, js8 js8, int i2) {
        String str;
        bd bdVar = (bd) this.a.getValue();
        wia wia = new wia("message_id", Long.valueOf(j));
        int i3 = 1;
        if (i != 1) {
            i3 = 2;
            if (i != 2) {
                i3 = 3;
                if (i != 3) {
                    throw null;
                }
            }
        }
        yr h = jjd.h(new wia[]{wia, new wia("element_type", Integer.valueOf(i3)), new wia("source_id", Long.valueOf(js8.a)), new wia("source_type", Integer.valueOf(js8.b))});
        ? obj = new Object();
        obj.a = System.currentTimeMillis();
        obj.c = "MESSAGE_CLICKABLE_ELEMENT_ACTIONS";
        if (i2 == 1) {
            str = "clicked_clickable_element";
        } else if (i2 == 2) {
            str = "clicked_copy";
        } else if (i2 == 3) {
            str = "clicked_open_link";
        } else if (i2 == 4) {
            str = "clicked_open_mail";
        } else if (i2 == 5) {
            str = "clicked_call";
        } else {
            throw null;
        }
        obj.o = str;
        t97 t97 = this.b;
        obj.b = ((lqc) ((f03) t97.getValue())).s();
        obj.c(h);
        obj.X = ((i03) ((f03) t97.getValue())).D();
        bdVar.j(obj.d());
    }
}
