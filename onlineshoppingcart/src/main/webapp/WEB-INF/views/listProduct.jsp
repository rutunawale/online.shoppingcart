		<!-- Would be to display products -->
		<div>

			<!-- added breadcrumb component -->
			<div class="row">

				<div class="col-lg-12">

					<c:if test="${userClickAllProducts == true}">

						<script>
							window.categoryId= '';
						</script>

						<ol class="breadcrumb">

							<li><a href="${contextRoot}/home">HOME</a></li>
							<li class="active">All Products</li>

						</ol>
					</c:if>

					<c:if test="${userClickCategoryProducts == true}">

						<script>
							window.categoryId = '${category.id}';
						</script>

						<ol class="breadcrumb">

							<li><a href="${contextRoot}/home">HOME</a></li>
							<li class="active">Category</li>
							<li class="active">${category.name}</li>

						</ol>
					</c:if>

				</div>

			</div>

			<div class="row">

				<div class="col-xs-12">

					<table id="productListTable"
						class="table table-striped table-bordered">

						<thead>

							<tr>

                                <th>id</th>
								<th>Name</th>
								<th>Brand</th>
								<th>Price</th>
								<th>quantity</th>
								
							</tr>

						</thead>


						<tfoot>

							<tr>

                                <th>id</th>
								<th>Name</th>
								<th>Brand</th>
								<th>Price</th>
								<th>quantity</th>
								
							</tr>

						</tfoot>

					</table>

				</div>

			</div>

		</div>