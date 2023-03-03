# DigitalBusinessEnablement

Uma API para o app de vendas e compras de veículos.

## Endpoints

- Despesas
    - Cadastrar
    - Mostrar detalhes
    - Apagar
    - Atualizar
    - Listar todas
- Contas
- Categorias

---

...
### Cadastrar Despesa

'POST' /api/despesa

**Campos da requisição**

| campo | tipo | obrigatório | descrição
|-------|------|:-------------:|--------
| valor | decimal | sim      | o valor da despesa deve ser maior que zero
| data  | data | sim         | a data da despesa
| categoria_id | int | sim | código de uma categoria previamente cadastrada
| conta_id | int | int | o código de uma conta previamente cadastrada
| descrição | texto | não | um texto sobre a despesa com no máximo de 255 caracteres

**Exemplo de corpo de requisição**

'''js

{
    valor: 100.00,
    data: '2023-02-28',
    categoria_id: 1,
    conta_id: 1,
    descricao: 'cinema'
}
'''

**Códigos da Resposta**

| código | descrição
|-|-
| 200 | despesa cadastrada com sucesso
| 404 | os campo enviados são inválidos

---

...
### Detalhar Despesa

'GET' /api/despesa/{id}

**Exemplo de Corpo da Resposta**

'''js
{
    valor: 100.00,
    data: '2023-02-28',
    categoria: {
        categoria_id: 1,
        nome: 'lazer',
    },
    conta: {
        conta_id: 1,
        nome: 'itaú',
    },
    descricao: 'cinema'
}
'''

**Códigos da Resposta**

| código | descrição
|-|-
| 200 | despesa cadastrada com sucesso
| 404 | os campo enviados são inválidos
