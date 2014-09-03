package org.talend.designer.components.localprovider;

import java.io.File;
import java.net.URL;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.talend.designer.codegen.additionaljet.AbstractJetFileProvider;
import org.talend.designer.components.ComponentsLocalProviderPlugin;

public class BoxJetFileProvider extends AbstractJetFileProvider {
	
	private static Logger logger = Logger.getLogger(MDMTriggerJetFileProvider.class);

	@Override
	protected File getExternalFrameLocation() {
		try {
            URL url = FileLocator.find(ComponentsLocalProviderPlugin.getDefault().getBundle(), new Path("resources/box"), null);

            URL fileUrl = FileLocator.toFileURL(url);
            return new File(fileUrl.getPath());

        } catch (Exception e) {
            logger.error(e);
        }
        return null;
	}

	
}