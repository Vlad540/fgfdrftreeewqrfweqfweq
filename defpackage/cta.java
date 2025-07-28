package defpackage;

import android.util.AttributeSet;
import androidx.viewpager2.widget.ViewPager2;
import one.me.chats.picker.PickerChatsTabWidget;

/* renamed from: cta  reason: default package */
public final /* synthetic */ class cta implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerChatsTabWidget b;

    public /* synthetic */ cta(PickerChatsTabWidget pickerChatsTabWidget, int i) {
        this.a = i;
        this.b = pickerChatsTabWidget;
    }

    public final Object invoke() {
        PickerChatsTabWidget pickerChatsTabWidget = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = PickerChatsTabWidget.z0;
                hda hda = new hda(pickerChatsTabWidget.getContext(), (AttributeSet) null);
                hda.setId(f2a.e);
                hda.setTabMode(0);
                return hda;
            default:
                k77[] k77Arr2 = PickerChatsTabWidget.z0;
                ViewPager2 viewPager2 = new ViewPager2(pickerChatsTabWidget.getContext());
                viewPager2.setId(f2a.d);
                swb.r(viewPager2);
                return viewPager2;
        }
    }
}
