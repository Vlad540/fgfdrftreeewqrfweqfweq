package ru.ok.messages.stickers.sets.adapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;

public class FixedSizePerPageLinearLayoutManager extends LinearLayoutManager {
    public final boolean g(n6c n6c) {
        if (n6c == null) {
            return false;
        }
        return n6c.width == Math.round(((float) (this.p == 0 ? this.n : this.o)) / ((float) 0));
    }

    public final n6c s() {
        n6c s = FixedSizePerPageLinearLayoutManager.super.s();
        int round = Math.round(((float) (this.p == 0 ? this.n : this.o)) / ((float) 0));
        if (this.p == 0) {
            s.width = round;
        } else {
            s.height = round;
        }
        return s;
    }

    public final n6c u(ViewGroup.LayoutParams layoutParams) {
        n6c u = FixedSizePerPageLinearLayoutManager.super.u(layoutParams);
        int round = Math.round(((float) (this.p == 0 ? this.n : this.o)) / ((float) 0));
        if (this.p == 0) {
            u.width = round;
        } else {
            u.height = round;
        }
        return u;
    }
}
