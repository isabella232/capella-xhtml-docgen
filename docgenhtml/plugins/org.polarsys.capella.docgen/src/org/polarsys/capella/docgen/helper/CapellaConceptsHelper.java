/*******************************************************************************
 * Copyright (c) 2006, 2020 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.docgen.helper;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.docgen.util.CapellaLabelProviderHelper;
import org.polarsys.capella.docgen.util.DocGenHtmlCapellaControl;
import org.polarsys.kitalpha.doc.gen.business.core.helper.IConceptsHelper;

public class CapellaConceptsHelper implements IConceptsHelper {

	public boolean accept(Object modelElement) {
		if (modelElement instanceof CapellaElement) {
			return DocGenHtmlCapellaControl.isPageCandidate((CapellaElement) modelElement);
		} else {
			return false;
		}
	}

	public String getConceptLabel(Object modelElement) {
		if (modelElement instanceof EObject)
			return CapellaLabelProviderHelper.getText((EObject) modelElement);
		return modelElement.toString();
	}

}
