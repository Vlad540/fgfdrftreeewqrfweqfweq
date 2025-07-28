package defpackage;

import android.view.View;

/* renamed from: d32  reason: default package */
public final /* synthetic */ class d32 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ d32(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    public final boolean onLongClick(View view) {
        i26 i26;
        switch (this.a) {
            case 0:
                ((i26) this.b).invoke((jh8) this.c, ((e32) this.o).a);
                return true;
            case 1:
                ((i26) this.b).invoke((oh8) this.c, ((e32) this.o).a);
                return true;
            case 2:
                ((i26) this.b).invoke((qh8) this.c, ((e32) this.o).a);
                return true;
            case 3:
                ((i26) this.b).invoke((rn2) this.c, (p32) this.o);
                return true;
            case 4:
                ((i26) this.b).invoke(Long.valueOf(((pi2) this.c).a), ((pp2) this.o).a);
                return true;
            case 5:
                ((i26) this.b).invoke((fn3) this.c, (kh3) this.o);
                return true;
            case 6:
                ((i26) this.b).invoke(Long.valueOf(((y75) this.c).a), ((w75) this.o).a);
                return true;
            case 7:
                ((i26) this.b).invoke(Long.valueOf(((y75) this.c).a), ((a85) this.o).a);
                return true;
            case 8:
                a30 a30 = (a30) this.b;
                u16 u16 = (u16) a30.Y;
                if (u16 == null) {
                    return false;
                }
                boolean booleanValue = ((Boolean) u16.invoke(((gda) this.c).getTabItem())).booleanValue();
                if (!booleanValue || (i26 = (i26) a30.Z) == null) {
                    return booleanValue;
                }
                i26.invoke(view, (sz9) this.o);
                return booleanValue;
            default:
                ((i26) this.b).invoke((w96) this.c, (p32) this.o);
                return true;
        }
    }
}
