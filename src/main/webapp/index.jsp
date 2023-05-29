<div class="card">
  <h:form id="form">
    <p:growl id="msgs" showDetail="true"/>

    <p:dataTable id="products1" widgetVar="products1" var="product" value="#{dtAddRowView.products1}"
                 editable="true">
      <f:facet name="header">
        Row Editing with add functionality
      </f:facet>

      <p:ajax event="rowEdit" listener="#{dtAddRowView.onRowEdit}" update=":form:msgs"/>
      <p:ajax event="rowEditCancel" listener="#{dtAddRowView.onRowCancel}" update=":form:msgs"/>

      <p:column headerText="Id">
        <p:cellEditor>
          <f:facet name="output"><h:outputText value="#{PracownicyEntity.pracId}"/></f:facet>
          <f:facet name="input"><p:inputText id="modelInput" value="#{PracownicyEntity.pracId}"
                                             style="width:100%"/></f:facet>
        </p:cellEditor>
      </p:column>

      <p:column headerText="Imię">
        <p:cellEditor>
          <f:facet name="output"><h:outputText value="#{PracownicyEntity.pracImie}"/></f:facet>
          <f:facet name="input"><p:inputText value="#{PracownicyEntity.pracImie}" style="width:100%"
                                             label="firstName"/></f:facet>
        </p:cellEditor>
      </p:column>
      <p:column headerText="Nazwisko">
        <p:cellEditor>
          <f:facet name="output"><h:outputText value="#{PracownicyEntity.pracNazwisko}"/></f:facet>
          <f:facet name="input"><p:inputText value="#{PracownicyEntity.pracNazwisko}" style="width:100%"
                                             label="lastName"/></f:facet>
        </p:cellEditor>
      </p:column>

      <p:column headerText="Wiek">
        <p:cellEditor>
          <f:facet name="output"><h:outputText value="#{PracownicyEntity.pracWiek}"/></f:facet>
          <f:facet name="input"><p:inputText value="#{PracownicyEntity.pracWiek}" style="width:100%"
                                             label="Age"/></f:facet>
        </p:cellEditor>
      </p:column>

      <p:column headerText="Nr telefonu">
        <p:cellEditor>
          <f:facet name="output"><h:outputText value="#{PracownicyEntity.pracNrTelefonu}"/></f:facet>
          <f:facet name="input"><p:inputText value="#{PracownicyEntity.pracNrTelefonu}" style="width:100%"
                                             label="PhoneNumber"/></f:facet>
        </p:cellEditor>
      </p:column>

      <p:column headerText="Email">
        <p:cellEditor>
          <f:facet name="output"><h:outputText value="#{PracownicyEntity.pracEmail}"/></f:facet>
          <f:facet name="input"><p:inputText value="#{PracownicyEntity.pracEmail}" style="width:100%"
                                             label="Email"/></f:facet>
        </p:cellEditor>
      </p:column>



      <p:column style="width:6rem">
        <p:rowEditor/>
      </p:column>
    </p:dataTable>

    <div class="grid mt-3">
      <div class="col-12">
        <p:commandButton value="Add new row" process="@this" update=":form:msgs"
                         action="#{dtAddRowView.onAddNew()}" oncomplete="PF('products1').addRow();"/>
      </div>
    </div>

  </h:form>
</div>