package defpackage;

import android.util.AttributeSet;
import androidx.viewpager2.widget.ViewPager2;
import one.me.chats.picker.chats.PickerChatsTabWidget2;

/* renamed from: gta  reason: default package */
public final /* synthetic */ class gta implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerChatsTabWidget2 b;

    public /* synthetic */ gta(PickerChatsTabWidget2 pickerChatsTabWidget2, int i) {
        this.a = i;
        this.b = pickerChatsTabWidget2;
    }

    public final Object invoke() {
        PickerChatsTabWidget2 pickerChatsTabWidget2 = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = PickerChatsTabWidget2.C0;
                hda hda = new hda(pickerChatsTabWidget2.getContext(), (AttributeSet) null);
                hda.setId(f2a.e);
                hda.setTabMode(0);
                return hda;
            default:
                k77[] k77Arr2 = PickerChatsTabWidget2.C0;
                ViewPager2 viewPager2 = new ViewPager2(pickerChatsTabWidget2.getContext());
                viewPager2.setId(f2a.d);
                swb.r(viewPager2);
                return viewPager2;
        }
    }
}
