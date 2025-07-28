package defpackage;

import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: hj2  reason: default package */
public final class hj2 implements syd {
    public final /* synthetic */ int a;
    public final u16 b;

    public /* synthetic */ hj2(int i, u16 u16) {
        this.a = i;
        this.b = u16;
    }

    public final Object a(int i) {
        switch (this.a) {
            case 0:
                if (i < 0) {
                    return null;
                }
                return (CharSequence) this.b.invoke(Integer.valueOf(i));
            case 1:
                if (i < 0) {
                    return null;
                }
                return (CharSequence) this.b.invoke(Integer.valueOf(i));
            case 2:
                if (i < 0) {
                    return null;
                }
                return (CharSequence) this.b.invoke(Integer.valueOf(i));
            case 3:
                if (i < 0) {
                    return null;
                }
                return (CharSequence) this.b.invoke(Integer.valueOf(i));
            case 4:
                return d(i);
            default:
                if (i < 0) {
                    return null;
                }
                return (CharSequence) this.b.invoke(Integer.valueOf(i));
        }
    }

    public final myd b(ViewGroup viewGroup) {
        switch (this.a) {
            case 0:
                return new gj2(new TextView(viewGroup.getContext()));
            case 1:
                return new ew2(new TextView(viewGroup.getContext()));
            case 2:
                return new gp3(new AppCompatTextView(viewGroup.getContext(), (AttributeSet) null));
            case 3:
                return new a17(new AppCompatTextView(viewGroup.getContext(), (AttributeSet) null));
            case 4:
                return new eb7(new AppCompatTextView(viewGroup.getContext(), (AttributeSet) null, 0));
            default:
                FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
                frameLayout.addView(new AppCompatTextView(viewGroup.getContext(), (AttributeSet) null));
                return new o0c(frameLayout);
        }
    }

    public final void c(myd myd, int i) {
        switch (this.a) {
            case 0:
                ((gj2) myd).o.setText((CharSequence) a(i));
                return;
            case 1:
                ((ew2) myd).o.setText((CharSequence) a(i));
                return;
            case 2:
                ((gp3) myd).o.setText((CharSequence) a(i));
                return;
            case 3:
                ((a17) myd).o.setText((CharSequence) a(i));
                return;
            case 4:
                Character d = d(i);
                TextView textView = ((eb7) myd).o;
                if (d != null) {
                    textView.setText(new char[]{d.charValue()}, 0, 1);
                    return;
                }
                textView.setText((CharSequence) null);
                return;
            default:
                TextView textView2 = ((o0c) myd).o;
                textView2.setText((CharSequence) a(i));
                textView2.setTextSize(1, 14.0f);
                return;
        }
    }

    public Character d(int i) {
        char c;
        Character ch = null;
        if (i < 0) {
            return null;
        }
        CharSequence charSequence = (CharSequence) this.b.invoke(Integer.valueOf(i));
        if (charSequence == null) {
            return null;
        }
        Character valueOf = charSequence.length() == 0 ? null : Character.valueOf(charSequence.charAt(0));
        if (valueOf != null) {
            if (Character.isLetter(valueOf.charValue())) {
                ch = valueOf;
            }
            if (ch != null) {
                c = Character.toUpperCase(ch.charValue());
                return Character.valueOf(c);
            }
        }
        c = '#';
        return Character.valueOf(c);
    }
}
