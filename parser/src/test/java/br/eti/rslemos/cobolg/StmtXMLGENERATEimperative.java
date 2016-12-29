/*******************************************************************************
 * BEGIN COPYRIGHT NOTICE
 * 
 * This file is part of program "cobolg"
 * Copyright 2016  Rodrigo Lemos
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * END COPYRIGHT NOTICE
 ******************************************************************************/
package br.eti.rslemos.cobolg;

import java.util.ResourceBundle;

import org.junit.Ignore;
import org.junit.Test;

import br.eti.rslemos.cobolg.COBOLParser.StmtXMLGENERATEimperativeContext;
import br.eti.rslemos.cobolg.Waive.CompilationError;

public class StmtXMLGENERATEimperative {
	private static final ResourceBundle TEST_DATA = ResourceBundle.getBundle("br.eti.rslemos.cobolg.stmtXMLGENERATEimperative");
	public static String get(String key) { return TEST_DATA.getString(key); }

	private static CompilerHelper<StmtXMLGENERATEimperativeContext> helper = new CompilerHelper<StmtXMLGENERATEimperativeContext>() {
		@Override protected StmtXMLGENERATEimperativeContext parsePart() { return parser.stmtXMLGENERATEimperative(); }
	};
	
	@Test public void XML_GENERATE_XML_1_FROM_SOURCE_0() {
		helper.compileAndVerify(
				get("XML_GENERATE_XML_1_FROM_SOURCE_0.source"),
				get("XML_GENERATE_XML_1_FROM_SOURCE_0.tree")
			);
	}
	
	@Test public void XML_GENERATE_XML_1_FROM_SOURCE_0_COUNT_IN_C() {
		helper.compileAndVerify(
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_COUNT_IN_C.source"),
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_COUNT_IN_C.tree")
			);
	}
	
	@Test public void XML_GENERATE_XML_1_FROM_SOURCE_0_WITH_ENCODING_1200() {
		helper.compileAndVerify(
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_WITH_ENCODING_1200.source"),
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_WITH_ENCODING_1200.tree")
			);
	}
	
	@Test public void XML_GENERATE_XML_1_FROM_SOURCE_0_WITH_XML_DECLARATION() {
		helper.compileAndVerify(
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_WITH_XML_DECLARATION.source"),
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_WITH_XML_DECLARATION.tree")
			);
	}
	
	@Test public void XML_GENERATE_XML_1_FROM_SOURCE_0_WITH_ATTRIBUTES() {
		helper.compileAndVerify(
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_WITH_ATTRIBUTES.source"),
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_WITH_ATTRIBUTES.tree")
			);
	}
	
	@Test public void XML_GENERATE_XML_1_FROM_SOURCE_0_NAMESPACE_IS_NS_NAME() {
		helper.compileAndVerify(
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_NAMESPACE_IS_NS_NAME.source"),
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_NAMESPACE_IS_NS_NAME.tree")
			);
	}
	
	@Test public void XML_GENERATE_XML_1_FROM_SOURCE_0_NAMESPACE_IS_URL() {
		helper.compileAndVerify(
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_NAMESPACE_IS_URL.source"),
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_NAMESPACE_IS_URL.tree")
			);
	}
	
	@Test public void XML_GENERATE_XML_1_FROM_SOURCE_0_NAMESPACE_IS_NS_NAME_NAMESPACE_PREFIX_IS_NS_PREFIX() {
		helper.compileAndVerify(
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_NAMESPACE_IS_NS_NAME_NAMESPACE_PREFIX_IS_NS_PREFIX.source"),
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_NAMESPACE_IS_NS_NAME_NAMESPACE_PREFIX_IS_NS_PREFIX.tree")
			);
	}
	
	@Test public void XML_GENERATE_XML_1_FROM_SOURCE_0_NAMESPACE_IS_NS_NAME_NAMESPACE_PREFIX_IS_QUOTED_PREFIX() {
		helper.compileAndVerify(
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_NAMESPACE_IS_NS_NAME_NAMESPACE_PREFIX_IS_QUOTED_PREFIX.source"),
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_NAMESPACE_IS_NS_NAME_NAMESPACE_PREFIX_IS_QUOTED_PREFIX.tree")
			);
	}
	
	@Test public void XML_GENERATE_XML_1_FROM_SOURCE_0_NAMESPACE_IS_URL_NAMESPACE_PREFIX_IS_NS_PREFIX() {
		helper.compileAndVerify(
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_NAMESPACE_IS_URL_NAMESPACE_PREFIX_IS_NS_PREFIX.source"),
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_NAMESPACE_IS_URL_NAMESPACE_PREFIX_IS_NS_PREFIX.tree")
			);
	}
	
	@Test public void XML_GENERATE_XML_1_FROM_SOURCE_0_NAMESPACE_IS_URL_NAMESPACE_PREFIX_IS_QUOTED_PREFIX() {
		helper.compileAndVerify(
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_NAMESPACE_IS_URL_NAMESPACE_PREFIX_IS_QUOTED_PREFIX.source"),
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_NAMESPACE_IS_URL_NAMESPACE_PREFIX_IS_QUOTED_PREFIX.tree")
			);
	}
	
	@Test public void XML_GENERATE_XML_1_FROM_SOURCE_0_NAME_OF_ID_1_IS_QUOTED_ID1() {
		helper.compileAndVerify(
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_NAME_OF_ID_1_IS_QUOTED_ID1.source"),
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_NAME_OF_ID_1_IS_QUOTED_ID1.tree")
			);
	}
	
	@Test public void XML_GENERATE_XML_1_FROM_SOURCE_0_NAME_OF_ID_1_IS_QUOTED_ID1_ID_2_IS_QUOTED_ID_2() {
		helper.compileAndVerify(
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_NAME_OF_ID_1_IS_QUOTED_ID1_ID_2_IS_QUOTED_ID_2.source"),
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_NAME_OF_ID_1_IS_QUOTED_ID1_ID_2_IS_QUOTED_ID_2.tree")
			);
	}
	
	@Test public void XML_GENERATE_XML_1_FROM_SOURCE_0_TYPE_OF_VAL_1_IS_ATTRIBUTE() {
		helper.compileAndVerify(
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_TYPE_OF_VAL_1_IS_ATTRIBUTE.source"),
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_TYPE_OF_VAL_1_IS_ATTRIBUTE.tree")
			);
	}
	
	@Test public void XML_GENERATE_XML_1_FROM_SOURCE_0_TYPE_OF_VAL_1_IS_ELEMENT() {
		helper.compileAndVerify(
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_TYPE_OF_VAL_1_IS_ELEMENT.source"),
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_TYPE_OF_VAL_1_IS_ELEMENT.tree")
			);
	}
	
	@Test public void XML_GENERATE_XML_1_FROM_SOURCE_0_TYPE_OF_VAL_1_IS_CONTENT() {
		helper.compileAndVerify(
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_TYPE_OF_VAL_1_IS_CONTENT.source"),
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_TYPE_OF_VAL_1_IS_CONTENT.tree")
			);
	}
	
	@Test public void XML_GENERATE_XML_1_FROM_SOURCE_0_TYPE_OF_VAL_1_IS_ATTRIBUTE_VAL_2_IS_CONTENT() {
		helper.compileAndVerify(
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_TYPE_OF_VAL_1_IS_ATTRIBUTE_VAL_2_IS_CONTENT.source"),
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_TYPE_OF_VAL_1_IS_ATTRIBUTE_VAL_2_IS_CONTENT.tree")
			);
	}
	
	@Test public void XML_GENERATE_XML_1_FROM_SOURCE_0_TYPE_OF_VAL_1_IS_ELEMENT_VAL_2_IS_ATTRIBUTE() {
		helper.compileAndVerify(
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_TYPE_OF_VAL_1_IS_ELEMENT_VAL_2_IS_ATTRIBUTE.source"),
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_TYPE_OF_VAL_1_IS_ELEMENT_VAL_2_IS_ATTRIBUTE.tree")
			);
	}
	
	@Test public void XML_GENERATE_XML_1_FROM_SOURCE_0_TYPE_OF_VAL_1_IS_CONTENT_VAL_2_IS_ELEMENT() {
		helper.compileAndVerify(
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_TYPE_OF_VAL_1_IS_CONTENT_VAL_2_IS_ELEMENT.source"),
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_TYPE_OF_VAL_1_IS_CONTENT_VAL_2_IS_ELEMENT.tree")
			);
	}
	
	@Test public void XML_GENERATE_XML_1_FROM_SOURCE_0_SUPPRESS_X_1() {
		helper.compileAndVerify(
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_SUPPRESS_X_1.source"),
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_SUPPRESS_X_1.tree")
			);
	}
	
	@Waive({CompilationError.EXACT_AMBIGUITY, CompilationError.FULL_CONTEXT_ATTEMPT})
	@Test public void XML_GENERATE_XML_1_FROM_SOURCE_0_SUPPRESS_X_1_WHEN_ZEROS_OR_SPACES_OR_LOW_VALUES() {
		helper.compileAndVerify(
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_SUPPRESS_X_1_WHEN_ZEROS_OR_SPACES_OR_LOW_VALUES.source"),
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_SUPPRESS_X_1_WHEN_ZEROS_OR_SPACES_OR_LOW_VALUES.tree")
			);
	}
	
	@Test public void XML_GENERATE_XML_1_FROM_SOURCE_0_SUPPRESS_EVERY_NUMERIC_ATTRIBUTE_WHEN_ZEROS_OR_LOW_VALUES_OR_HIGH_VALUES() {
		helper.compileAndVerify(
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_SUPPRESS_EVERY_NUMERIC_ATTRIBUTE_WHEN_ZEROS_OR_LOW_VALUES_OR_HIGH_VALUES.source"),
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_SUPPRESS_EVERY_NUMERIC_ATTRIBUTE_WHEN_ZEROS_OR_LOW_VALUES_OR_HIGH_VALUES.tree")
			);
	}
	
	@Waive({CompilationError.EXACT_AMBIGUITY, CompilationError.FULL_CONTEXT_ATTEMPT})
	@Test public void XML_GENERATE_XML_1_FROM_SOURCE_0_SUPPRESS_X_1_X_2_WHEN_ZERO_SPACE_LOW_VALUE() {
		helper.compileAndVerify(
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_SUPPRESS_X_1_X_2_WHEN_ZERO_SPACE_LOW_VALUE.source"),
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_SUPPRESS_X_1_X_2_WHEN_ZERO_SPACE_LOW_VALUE.tree")
			);
	}
	
	@Waive({CompilationError.EXACT_AMBIGUITY, CompilationError.FULL_CONTEXT_ATTEMPT})
	@Test public void XML_GENERATE_XML_1_FROM_SOURCE_0_SUPPRESS_X_1_WHEN_HIGH_VALUES_EVERY_NONNUMERIC_WHEN_SPACES() {
		helper.compileAndVerify(
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_SUPPRESS_X_1_WHEN_HIGH_VALUES_EVERY_NONNUMERIC_WHEN_SPACES.source"),
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_SUPPRESS_X_1_WHEN_HIGH_VALUES_EVERY_NONNUMERIC_WHEN_SPACES.tree")
			);
	}
	
	@Test public void XML_GENERATE_XML_1_FROM_SOURCE_0_SUPPRESS_EVERY_CONTENT_WHEN_ZERO_SPACE_X_2() {
		helper.compileAndVerify(
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_SUPPRESS_EVERY_CONTENT_WHEN_ZERO_SPACE_X_2.source"),
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_SUPPRESS_EVERY_CONTENT_WHEN_ZERO_SPACE_X_2.tree")
			);
	}
	
	@Test public void XML_GENERATE_XML_1_FROM_SOURCE_0_COUNT_IN_C_WITH_ENCODING_1208() {
		helper.compileAndVerify(
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_COUNT_IN_C_WITH_ENCODING_1208.source"),
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_COUNT_IN_C_WITH_ENCODING_1208.tree")
			);
	}
	
	@Test public void XML_GENERATE_XML_1_FROM_SOURCE_0_WITH_ENCODING_CDPG_WITH_XML_DECLARATION() {
		helper.compileAndVerify(
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_WITH_ENCODING_CDPG_WITH_XML_DECLARATION.source"),
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_WITH_ENCODING_CDPG_WITH_XML_DECLARATION.tree")
			);
	}
	
	@Test public void XML_GENERATE_XML_1_FROM_SOURCE_0_WITH_XML_DECLARATION_WITH_ATTRIBUTES() {
		helper.compileAndVerify(
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_WITH_XML_DECLARATION_WITH_ATTRIBUTES.source"),
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_WITH_XML_DECLARATION_WITH_ATTRIBUTES.tree")
			);
	}
	
	@Test public void XML_GENERATE_XML_1_FROM_SOURCE_0_WITH_ATTRIBUTES_NAMESPACE_IS_NS_NAME_NAMESPACE_PREFIX_IS_NS_PREFIX() {
		helper.compileAndVerify(
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_WITH_ATTRIBUTES_NAMESPACE_IS_NS_NAME_NAMESPACE_PREFIX_IS_NS_PREFIX.source"),
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_WITH_ATTRIBUTES_NAMESPACE_IS_NS_NAME_NAMESPACE_PREFIX_IS_NS_PREFIX.tree")
			);
	}
	
	@Test public void XML_GENERATE_XML_1_FROM_SOURCE_0_NAMESPACE_IS_URL_NAMESPACE_PREFIX_IS_QUOTED_PREFIX_NAME_OF_ID_1_IS_QUOTED_ID1() {
		helper.compileAndVerify(
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_NAMESPACE_IS_URL_NAMESPACE_PREFIX_IS_QUOTED_PREFIX_NAME_OF_ID_1_IS_QUOTED_ID1.source"),
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_NAMESPACE_IS_URL_NAMESPACE_PREFIX_IS_QUOTED_PREFIX_NAME_OF_ID_1_IS_QUOTED_ID1.tree")
			);
	}
	
	@Test public void XML_GENERATE_XML_1_FROM_SOURCE_0_NAME_OF_ID_1_IS_QUOTED_ID1_ID_2_IS_QUOTED_ID_2_TYPE_OF_VAL_1_IS_ELEMENT_VAL_2_IS_CONTENT() {
		helper.compileAndVerify(
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_NAME_OF_ID_1_IS_QUOTED_ID1_ID_2_IS_QUOTED_ID_2_TYPE_OF_VAL_1_IS_ELEMENT_VAL_2_IS_CONTENT.source"),
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_NAME_OF_ID_1_IS_QUOTED_ID1_ID_2_IS_QUOTED_ID_2_TYPE_OF_VAL_1_IS_ELEMENT_VAL_2_IS_CONTENT.tree")
			);
	}
	
	@Ignore
	@Waive({CompilationError.EXACT_AMBIGUITY, CompilationError.FULL_CONTEXT_ATTEMPT})
	@Test public void XML_GENERATE_XML_1_FROM_SOURCE_0_TYPE_OF_VAL_1_IS_CONTENT_VAL_2_IS_ATTRIBUTE_SUPPRESS_WHEN_HIGH_VALUE_X_2_WHEN_LOW_VALUE() {
		helper.compileAndVerify(
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_TYPE_OF_VAL_1_IS_CONTENT_VAL_2_IS_ATTRIBUTE_SUPPRESS_WHEN_HIGH_VALUE_X_2_WHEN_LOW_VALUE.source"),
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_TYPE_OF_VAL_1_IS_CONTENT_VAL_2_IS_ATTRIBUTE_SUPPRESS_WHEN_HIGH_VALUE_X_2_WHEN_LOW_VALUE.tree")
			);
	}
	
	@Waive({CompilationError.EXACT_AMBIGUITY, CompilationError.FULL_CONTEXT_ATTEMPT})
	@Test public void XML_GENERATE_XML_1_FROM_SOURCE_0_COUNT_C_ENCODING_CDPG_XML_DECLARATION_ATTRIBUTES_NAMESPACE_NS_NAME_NAMESPACE_PREFIX_QUOTED_PREFIX_NAME_ID_1_QUOTED_ID1_ID_2_QUOTED_ID_2_TYPE_VAL_1_ATTRIBUTE_VAL_2_ELEMENT_SUPPRESS_X_1_WHEN_ZEROES_X_2_WHEN_HIGH_VALUE() {
		helper.compileAndVerify(
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_COUNT_C_ENCODING_CDPG_XML_DECLARATION_ATTRIBUTES_NAMESPACE_NS_NAME_NAMESPACE_PREFIX_QUOTED_PREFIX_NAME_ID_1_QUOTED_ID1_ID_2_QUOTED_ID_2_TYPE_VAL_1_ATTRIBUTE_VAL_2_ELEMENT_SUPPRESS_X_1_WHEN_ZEROES_X_2_WHEN_HIGH_VALUE.source"),
				get("XML_GENERATE_XML_1_FROM_SOURCE_0_COUNT_C_ENCODING_CDPG_XML_DECLARATION_ATTRIBUTES_NAMESPACE_NS_NAME_NAMESPACE_PREFIX_QUOTED_PREFIX_NAME_ID_1_QUOTED_ID1_ID_2_QUOTED_ID_2_TYPE_VAL_1_ATTRIBUTE_VAL_2_ELEMENT_SUPPRESS_X_1_WHEN_ZEROES_X_2_WHEN_HIGH_VALUE.tree")
			);
	}
}
