package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import one.me.chats.picker.chats.PickerChatsListWidget2;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: tsa  reason: default package */
public final /* synthetic */ class tsa implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerChatsListWidget2 b;

    public /* synthetic */ tsa(PickerChatsListWidget2 pickerChatsListWidget2, int i) {
        this.a = i;
        this.b = pickerChatsListWidget2;
    }

    public final Object invoke() {
        boolean z = true;
        PickerChatsListWidget2 pickerChatsListWidget2 = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = PickerChatsListWidget2.G0;
                tp2 tp2 = tp2.a;
                Class<f03> cls = f03.class;
                qr2 qr2 = new qr2((Context) tp2.getAccessor().c(Context.class), new qga(7), tp2.getAccessor().d(cls), tp2.getAccessor().d(xzc.class), tp2.getAccessor().d(jb5.class), tp2.getAccessor().d(q2b.class), tp2.getAccessor().d(ho2.class), tp2.getAccessor().d(go2.class));
                r7e r7e = new r7e(new qga(8));
                pae d = tp2.d();
                rw6 rw6 = new rw6(qr2);
                ok3 ok3 = (ok3) tp2.getAccessor().c(ok3.class);
                r7e d2 = tp2.getAccessor().d(vs7.class);
                kr2 a2 = ((mq2) tp2.getAccessor().c(mq2.class)).a(pickerChatsListWidget2.b);
                k77 k77 = PickerChatsListWidget2.G0[0];
                return new ksa(pickerChatsListWidget2.b, a2, ok3, (f03) tp2.getAccessor().c(cls), new tsa(pickerChatsListWidget2, 4), (q72) pickerChatsListWidget2.c.a(pickerChatsListWidget2), d, d2, rw6, r7e);
            case 1:
                k77[] k77Arr2 = PickerChatsListWidget2.G0;
                p4a p4a = new p4a(pickerChatsListWidget2.getContext(), (AttributeSet) null);
                p4a.setIcon(phc.O0);
                p4a.setTitle(new hge(rhc.d));
                p4a.setSubtitle(new hge(rhc.c));
                return p4a;
            case 2:
                k77[] k77Arr3 = PickerChatsListWidget2.G0;
                EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(pickerChatsListWidget2.getContext(), (AttributeSet) null, 6);
                endlessRecyclerView2.setId(f2a.k);
                endlessRecyclerView2.setClipChildren(false);
                endlessRecyclerView2.setClipToPadding(false);
                endlessRecyclerView2.setClipToOutline(false);
                return endlessRecyclerView2;
            case 3:
                k77[] k77Arr4 = PickerChatsListWidget2.G0;
                return new tw2(new tsa(pickerChatsListWidget2, 5), new e98(16, pickerChatsListWidget2), new usa(pickerChatsListWidget2, 0), new usa(pickerChatsListWidget2, 1));
            case 4:
                k77 k772 = PickerChatsListWidget2.G0[1];
                if (!((Boolean) pickerChatsListWidget2.o.a(pickerChatsListWidget2)).booleanValue() || !hhd.f(pickerChatsListWidget2.b, "all.chat.folder")) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                k77[] k77Arr5 = PickerChatsListWidget2.G0;
                return xy6.n(pickerChatsListWidget2.getContext());
        }
    }
}
