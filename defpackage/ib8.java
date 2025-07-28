package defpackage;

import android.view.KeyEvent;
import android.widget.SeekBar;
import androidx.mediarouter.app.e;

/* renamed from: ib8  reason: default package */
public final class ib8 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ ib8(KeyEvent.Callback callback, int i) {
        this.a = i;
        this.b = callback;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        switch (this.a) {
            case 0:
                if (z) {
                    xb8 xb8 = (xb8) seekBar.getTag();
                    e eVar = (e) ((jb8) this.b).K0.get(xb8.c);
                    if (eVar != null) {
                        eVar.B(i == 0);
                    }
                    xb8.j(i);
                    return;
                }
                return;
            default:
                mya mya = (mya) this.b;
                if (!z || !mya.z0) {
                    mya.x0.setVisibility(8);
                    return;
                }
                lya lya = mya.A0;
                if (lya != null) {
                    ((cw6) lya).F0.g(new gs3(i));
                }
                f4f f4f = mya.x0;
                f4f.b.setText(d8.a((long) i));
                mza mza = mya.w0;
                f4f.setTranslationX(Math.min((float) ((mza.getWidth() - mya.o.getWidth()) - f4f.getWidth()), Math.max((float) mya.c.getWidth(), ((float) (mza.getThumbOffset() + (mya.getPaddingLeft() + mza.getThumb().getBounds().centerX()))) - (((float) f4f.getWidth()) / 2.0f))));
                return;
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        switch (this.a) {
            case 0:
                jb8 jb8 = (jb8) this.b;
                if (jb8.L0 != null) {
                    jb8.G0.removeMessages(2);
                }
                jb8.L0 = (xb8) seekBar.getTag();
                return;
            default:
                lya listener = ((mya) this.b).getListener();
                if (listener != null) {
                    ((cw6) listener).F0.g(hs3.a);
                    return;
                }
                return;
        }
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        switch (this.a) {
            case 0:
                ((jb8) this.b).G0.sendEmptyMessageDelayed(2, 500);
                return;
            default:
                mya mya = (mya) this.b;
                lya listener = mya.getListener();
                if (listener != null) {
                    ((cw6) listener).F0.g(new is3(seekBar.getProgress()));
                }
                mya.x0.setVisibility(8);
                return;
        }
    }
}
