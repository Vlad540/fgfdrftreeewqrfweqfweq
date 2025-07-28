package defpackage;

import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import one.me.profile.screens.media.ChatMediaTabWidget;

/* renamed from: ge2  reason: default package */
public final /* synthetic */ class ge2 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatMediaTabWidget b;

    public /* synthetic */ ge2(ChatMediaTabWidget chatMediaTabWidget, int i) {
        this.a = i;
        this.b = chatMediaTabWidget;
    }

    public final Object invoke() {
        ChatMediaTabWidget chatMediaTabWidget = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = ChatMediaTabWidget.A0;
                nea nea = new nea(chatMediaTabWidget.getContext(), 6);
                nea.setId(j8a.o0);
                nea.setForm(fea.a);
                nea.setLeftActions(new vda(new hd1(15)));
                return nea;
            case 1:
                k77[] k77Arr2 = ChatMediaTabWidget.A0;
                hda hda = new hda(chatMediaTabWidget.getContext(), (AttributeSet) null);
                hda.setId(j8a.k0);
                hda.setTabMode(0);
                hda.setTabGravity(2);
                return hda;
            default:
                k77[] k77Arr3 = ChatMediaTabWidget.A0;
                ViewPager2 viewPager2 = new ViewPager2(chatMediaTabWidget.getContext());
                viewPager2.setId(j8a.m0);
                viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                viewPager2.setOffscreenPageLimit(3);
                viewPager2.b(new hg0(2, chatMediaTabWidget));
                swb.r(viewPager2);
                return viewPager2;
        }
    }
}
