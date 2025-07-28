package defpackage;

import android.widget.SeekBar;
import androidx.mediarouter.app.d;
import ru.ok.messages.settings.FrgBaseSettings;

/* renamed from: rq0  reason: default package */
public final class rq0 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final /* synthetic */ Object c;

    public rq0(sq0 sq0, FrgBaseSettings frgBaseSettings) {
        this.c = sq0;
        this.b = frgBaseSettings;
    }

    private final void a(SeekBar seekBar, int i, boolean z) {
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        switch (this.a) {
            case 0:
                return;
            default:
                if (z) {
                    int i2 = d.D1;
                    ((xb8) seekBar.getTag()).j(i);
                    return;
                }
                return;
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        switch (this.a) {
            case 0:
                ((sq0) this.c).L0 = true;
                return;
            default:
                d dVar = (d) this.c;
                if (dVar.a1 != null) {
                    dVar.Y0.removeCallbacks((vp6) this.b);
                }
                dVar.a1 = (xb8) seekBar.getTag();
                return;
        }
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        switch (this.a) {
            case 0:
                sq0 sq0 = (sq0) this.c;
                e4d e4d = sq0.K0;
                if (e4d != null) {
                    ((FrgBaseSettings) this.b).v1(e4d.a, Integer.valueOf(seekBar.getProgress()));
                }
                sq0.L0 = false;
                return;
            default:
                ((d) this.c).Y0.postDelayed((vp6) this.b, 500);
                return;
        }
    }

    public rq0(d dVar) {
        this.c = dVar;
        this.b = new vp6(12, this);
    }
}
