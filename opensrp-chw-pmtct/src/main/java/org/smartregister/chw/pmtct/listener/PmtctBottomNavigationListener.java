package org.smartregister.chw.pmtct.listener;

import android.app.Activity;
import android.view.MenuItem;

import androidx.annotation.NonNull;

import org.smartregister.listener.BottomNavigationListener;
import org.smartregister.pmtct.R;
import org.smartregister.view.activity.BaseRegisterActivity;

public class PmtctBottomNavigationListener extends BottomNavigationListener {
    private Activity context;

    public PmtctBottomNavigationListener(Activity context) {
        super(context);
        this.context = context;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        super.onNavigationItemSelected(item);

        BaseRegisterActivity baseRegisterActivity = (BaseRegisterActivity) context;

        if (item.getItemId() == R.id.action_family) {
            baseRegisterActivity.switchToBaseFragment();
        }


        return true;
    }
}