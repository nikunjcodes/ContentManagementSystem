package com.cms.factory;

import com.cms.models.Theme;

public interface ThemeFactory {
    Theme createTheme(String name, String description);
}
